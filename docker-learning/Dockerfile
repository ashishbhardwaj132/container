FROM openjdk:8-alpine
WORKDIR /usr/src/services
COPY target/employee-service.jar .
EXPOSE 8082
ENTRYPOINT ["java","-jar","employee-service.jar"]