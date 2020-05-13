FROM tomcat:jdk8

VOLUME /tmp

EXPOSE 8080

ADD /target/*.war /usr/local/tomcat/webapps

EXPOSE 8080

CMD ["catalina.sh", "run"]

LABEL MAINTAINER "goyalnitin634@gmail.com"

