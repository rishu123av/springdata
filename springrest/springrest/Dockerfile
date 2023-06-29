# Use a base image with Java 17 and Maven
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the project files to the container
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn package

# Use a lightweight base image for the final runtime
FROM adoptopenjdk:17-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/student.jar .

# Set the entry point to run the JAR file
CMD ["java", "-jar", "student.jar"]