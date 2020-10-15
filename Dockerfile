FROM openjdk:8-jdk-alpine

WORKDIR /app
COPY . ./

RUN ./mvnw package

RUN cp ./target/*.jar app.jar
RUN ls

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ENTRYPOINT ["java","-jar","app.jar"]