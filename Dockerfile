FROM openjdk:21-slim
WORKDIR /productivity
COPY target/productivity-0.0.1-SNAPSHOT.jar productivity-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","productivity-0.0.1-SNAPSHOT.jar"]