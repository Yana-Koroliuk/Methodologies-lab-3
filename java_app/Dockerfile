FROM maven:3.8.3-openjdk-17 AS builder

WORKDIR /app

COPY pom.xml .
COPY /src ./src

RUN mvn package

FROM openjdk:17.0.1-jdk-slim

COPY --from=builder /app/target/spring_app-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]