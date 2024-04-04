FROM maven:3.8.3-openjdk-17

WORKDIR /app

COPY pom.xml .
COPY src ./src
RUN mvn package

ENTRYPOINT ["java", "-jar", "./target/spring_app-0.0.1-SNAPSHOT.jar"]
