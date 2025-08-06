FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:21-slim
WORKDIR /productivity
COPY --from=build /app/target/productivity-0.0.1-SNAPSHOT.jar productivity-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "productivity-0.0.1-SNAPSHOT.jar"]