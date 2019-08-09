#!/bin/bash

# start the java server stub
cd /root/tapi2.2-SpringBoot
MAVEN_OPTS=-Xmx1024m ~/apache-maven-3.3.9/bin/mvn spring-boot:run 
