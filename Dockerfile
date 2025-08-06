FROM openjdk:18
COPY target/productivity-0.0.1-SNAPSHOT.jar productivity-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","productivity-0.0.1-SNAPSHOT.jar"]

