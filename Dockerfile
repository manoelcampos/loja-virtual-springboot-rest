FROM amazoncorretto:17.0.7-alpine

# Configure working directory
RUN mkdir /app

COPY ./target/loja-virtual-springboot-rest-*.jar /app/app.jar
WORKDIR /app

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]