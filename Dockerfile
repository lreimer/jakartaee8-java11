FROM qaware/zulu-centos-payara-micro:11.0.5-5.194
COPY build/libs/jakartaee8-java11.war $DEPLOY_DIR
