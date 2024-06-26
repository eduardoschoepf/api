FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.JAR_FILE
COPY ./target/api-0.0.1-SNAPSHOT.jar app.jar

# Expose the H2 Console port
EXPOSE 8080

# Set the ENTRYPOINT to start the H2 server with remote connections allowed
ENTRYPOINT ["java", "-jar", "/app.jar", "-webAllowOthers", "-tcpAllowOthers"]