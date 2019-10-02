# Build
mvn clean package && docker build -t com.harsha/j2e-service .

# RUN

docker rm -f j2e-service || true && docker run -d -p 8080:8080 -p 4848:4848 --name j2e-service com.harsha/j2e-service 

http://localhost:8282/j2e-service/resources/ping

Open API : http://localhost:8282/openapi