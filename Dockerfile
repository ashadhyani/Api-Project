FROM openjdk:20
COPY  target/Api-0.0.1-SNAPSHOT.jar /Api-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT [ "java", "-jar", "/Api-0.0.1-SNAPSHOT.jar" ]