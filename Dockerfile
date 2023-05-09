# App build stage
FROM maven:3-amazoncorretto-17 AS build
RUN mkdir /app
WORKDIR /app
COPY . .
RUN mvn package

# App copy stage
FROM amazoncorretto:17.0.7-alpine

RUN mkdir /app
WORKDIR /app
COPY --from=build /app/target/loja-virtual-springboot-rest-*.jar ./app.jar

EXPOSE 8080
CMD [ "java", "-jar", "/app/app.jar" ]