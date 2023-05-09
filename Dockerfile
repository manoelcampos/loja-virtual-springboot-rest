# Build stage
FROM maven:3-amazoncorretto-17 AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package

# Final stage
FROM amazoncorretto:17.0.7-alpine

# Configure working directory
RUN mkdir /app

COPY --from=build ./target/loja-virtual-springboot-rest-*.jar /app/app.jar
WORKDIR /app

EXPOSE 8080
CMD [ "java", "-jar", "/app/app.jar" ]