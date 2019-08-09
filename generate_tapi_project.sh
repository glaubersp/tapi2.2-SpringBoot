#!/bin/bash

TAPI_VERSION=v2.2.0
TAPI_FOLDER_NAME=TAPI-$TAPI_VERSION
TAPI_REMOTE_FILE=$TAPI_VERSION.tar.gz
TAPI_LOCAL_FILE=$TAPI_FOLDER_NAME.tar.gz

SWAGGER_GENERATOR_VERSION=1.1.13
SWAGGER_GENERATOR_OUTPUT=tapi-2.2.json

SWAGGER_CODE_GEN_VERSION=3.0.10
SWAGGER_CODE_GEN_DEST=tapi2.2-SpringBoot

# Download and extract TAPI api files
wget https://github.com/OpenNetworkingFoundation/TAPI/archive/$TAPI_REMOTE_FILE -O $TAPI_LOCAL_FILE
tar xvzf $TAPI_LOCAL_FILE
rm -fr $TAPI_LOCAL_FILE

# Download Swagger Generator, generate JSON output and remove TAPI api files
wget https://github.com/bartoszm/yang2swagger/releases/download/$SWAGGER_GENERATOR_VERSION/swagger-generator-cli-$SWAGGER_GENERATOR_VERSION-executable.jar
cd $TAPI_FOLDER_NAME
java -jar ../swagger-generator-cli-$SWAGGER_GENERATOR_VERSION-executable.jar -yang-dir YANG/ -format json -content-type application/json -output ../$SWAGGER_GENERATOR_OUTPUT tapi-topology tapi-common tapi-connectivity tapi-dsr tapi-eth tapi-notification tapi-oam tapi-path-computation tapi-photonic-media tapi-virtual-network
cd ..

# Download Swagger codegen and generate springboot code from JSON file
wget http://central.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/$SWAGGER_CODE_GEN_VERSION/swagger-codegen-cli-$SWAGGER_CODE_GEN_VERSION.jar
java -jar swagger-codegen-cli-$SWAGGER_CODE_GEN_VERSION.jar generate -i $SWAGGER_GENERATOR_OUTPUT -l spring -o $SWAGGER_CODE_GEN_DEST

cp TAPI-2.2.0/YANG/*.yang tapi

# Run api
# Not working as the generated implementation files need JSON mock examples to be encoded to Java String manually.
# cd $SWAGGER_CODE_GEN_DEST
# MAVEN_OPTS=-Xmx1024m mvn spring-boot:run

docker build -t tapi2.2 .
docker run -d -P tapi2.2
