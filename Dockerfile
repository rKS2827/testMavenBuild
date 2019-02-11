FROM openjdk:8-jdk-alpine
add target/app.jar /qiwk/app.jar 
ENV QIWK_REPORT_HOME '/qiwk'
RUN mkdir /qiwk/config
volume /qiwk/config
EXPOSE 8080
ENTRYPOINT ["java","-jar","/qiwk/app.jar"]