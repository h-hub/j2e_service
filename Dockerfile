FROM airhacks/glassfish
COPY ./target/j2e-service.war ${DEPLOYMENT_DIR}
