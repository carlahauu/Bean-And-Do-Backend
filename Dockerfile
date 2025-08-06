FROM maven:3.8.5-openjdk-18 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package

FROM openjdk:18
WORKDIR /productivity
COPY --from=build /app/target/productivity-0.0.1-SNAPSHOT.jar productivity.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","productivity.jar"]