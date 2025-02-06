FROM openjdk:11-jdk-slim
MAINTAINER naresh240.qis@gmail.com
COPY ./target/gs-spring-boot-0.1.0.jar app.jar
ENTRYPOINT java -jar app.jar