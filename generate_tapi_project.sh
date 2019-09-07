#!/bin/bash

LOGFILE=./execution.log
TAPI_VERSION=2.2.0
TAPI_FOLDER_NAME=TAPI-$TAPI_VERSION
TAPI_REMOTE_FILE=v$TAPI_VERSION.tar.gz
TAPI_LOCAL_FILE=$TAPI_FOLDER_NAME.tar.gz

SWAGGER_GENERATOR_VERSION=1.1.13
SWAGGER_GENERATOR_OUTPUT=tapi-2.2.json

SWAGGER_CODE_GEN_VERSION=3.0.11
SWAGGER_CODE_GEN_DEST=tapi2.2-SpringBoot

touch $LOGFILE

# Download and extract TAPI api files
if [[ ! -f $TAPI_LOCAL_FILE ]];then
    wget -nv https://github.com/OpenNetworkingFoundation/TAPI/archive/$TAPI_REMOTE_FILE \
        -O $TAPI_LOCAL_FILE >>$LOGFILE 2>&1
fi
tar xzf $TAPI_LOCAL_FILE >>$LOGFILE 2>&1
# rm -fr $TAPI_LOCAL_FILE >>$LOGFILE 2>&1

# Download Swagger Generator, generate JSON output and remove TAPI api files
if [[ ! -f swagger-generator-cli-$SWAGGER_GENERATOR_VERSION-executable.jar ]];then
    wget -nv https://github.com/bartoszm/yang2swagger/releases/download/$SWAGGER_GENERATOR_VERSION/swagger-generator-cli-$SWAGGER_GENERATOR_VERSION-executable.jar \
        -O swagger-generator-cli-$SWAGGER_GENERATOR_VERSION-executable.jar >>$LOGFILE 2>&1
fi
cd $TAPI_FOLDER_NAME >>$LOGFILE 2>&1
java -jar ../swagger-generator-cli-$SWAGGER_GENERATOR_VERSION-executable.jar \
    -yang-dir YANG/ \
    -output ../$SWAGGER_GENERATOR_OUTPUT \
    -format json \
    -api-version 2.2 \
    -content-type application/yang-data+json \
    tapi-common tapi-connectivity tapi-dsr tapi-equipment tapi-eth tapi-notification tapi-oam \
    tapi-odu tapi-path-computation tapi-photonic-media tapi-topology tapi-virtual-network \
    >>../$LOGFILE 2>&1

cd ..

# Format JSON File
python -m json.tool $SWAGGER_GENERATOR_OUTPUT > $SWAGGER_GENERATOR_OUTPUT.new
mv $SWAGGER_GENERATOR_OUTPUT.new $SWAGGER_GENERATOR_OUTPUT  >>$LOGFILE 2>&1

sed -i 's/localhost:1234/http:\/\/localhost:1234/g' $SWAGGER_GENERATOR_OUTPUT  >>$LOGFILE 2>&1

# Download Swagger codegen and generate springboot code from JSON file
if [[ ! -f swagger-codegen-cli-$SWAGGER_CODE_GEN_VERSION.jar ]];then
    wget -nv http://central.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/$SWAGGER_CODE_GEN_VERSION/swagger-codegen-cli-$SWAGGER_CODE_GEN_VERSION.jar \
        -O swagger-codegen-cli-$SWAGGER_CODE_GEN_VERSION.jar >>$LOGFILE 2>&1
fi
java -jar swagger-codegen-cli-$SWAGGER_CODE_GEN_VERSION.jar \
    generate -i $SWAGGER_GENERATOR_OUTPUT \
    -l spring \
    -o $SWAGGER_CODE_GEN_DEST \
    -Djava8=true \
    -DdateLibrary=java8 \
    >>$LOGFILE 2>&1

#     -DgroupId="br.com.padtec" \
#     -DartifactId="padtec-tapi" \
#     -DartifactDescription="Padtec T-API Implementation" \
#     -DdeveloperOrganization="Padtec" \
#     -DdeveloperOrganizationUrl="http://www.padtec.com.br" \

cp $TAPI_FOLDER_NAME/YANG/*.yang tapi >>$LOGFILE 2>&1
# rm -fr $TAPI_FOLDER_NAME >>$LOGFILE 2>&1

# Run api
# Not working as the generated implementation files need JSON mock examples to be encoded to Java String manually.
# cd $SWAGGER_CODE_GEN_DEST  >>$LOGFILE 2>&1
# MAVEN_OPTS=-Xmx1024m mvn spring-boot:run  >>$LOGFILE 2>&1

# docker build -t tapi2.2 .
# docker run -d -P tapi2.2
