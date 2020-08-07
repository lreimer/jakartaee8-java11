FROM qaware/distroless-java-payara-micro:java11-5.201
COPY build/libs/jakartaee8-java11.war $DEPLOY_DIR
