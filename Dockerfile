# Use OpenJDK 17
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built jar file into the image
COPY target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
