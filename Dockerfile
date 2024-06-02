# Start with a base image containing Java runtime
FROM openjdk:17-jdk-alpine

# Add Maintainer Info
LABEL maintainer="email@example.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/sms2-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} sms2.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/sms2.jar"]