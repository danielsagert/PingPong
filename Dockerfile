FROM airhacks/wildfly
COPY ./target/pingpong.war ${DEPLOYMENT_DIR}