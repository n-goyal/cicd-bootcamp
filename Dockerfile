FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=/target/*.war

COPY ${JAR_FILE} app.war

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.war"]

LABEL MAINTAINER "goyalnitin634@gmail.com"
