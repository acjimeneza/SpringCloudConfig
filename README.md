# SpringCloudConfig

mvn -N io.takari:maven:wrapper

.\mvnw.cmd package  
.\mvnw package

java -jar .\target\keyvault-0.0.1-SNAPSHOT.jar

mvn spring-boot:run -Dspring-boot.run.profiles=dev,native,keyvault

mvn spring-boot:run -D spring-boot.run.profiles=dev,native,keyvault

docker build -t springio/gs-spring-boot-docker .
docker run -p 8000:8000 springio/spring-boot-docker
