FROM eclipse-temurin:11-jre-alpine

WORKDIR /app

COPY ./artifact/gs-spring-boot-0.1.0.jar app.jar

RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

CMD ["java", "-jar", "app.jar"]
