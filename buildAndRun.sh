#!/bin/sh
mvn clean package && docker build -t com.harsha/j2e-service .
docker rm -f j2e-service || true && docker run -d -p 8282:8282 -p 4848:4848 --name j2e-service com.harsha/j2e-service 
