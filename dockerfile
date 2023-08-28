#Build Stage

FROM maven:3.8.3-openjdk-17 as build
COPY . .
RUN mnv clear package -DskipTests

# Package Stage
FROM openjdk:17-jdk-slim
COPY --from=build /target/pedrosa-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]