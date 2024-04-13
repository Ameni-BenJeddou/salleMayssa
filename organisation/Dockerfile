FROM openjdk:17
EXPOSE 8083
ADD target/organisation-0.0.1-SNAPSHOT.jar organisation-docker.jar
ENTRYPOINT ["java", "-jar","organisation-docker.jar"]