FROM maven:3.6.3-jdk-8-slim as builder

WORKDIR /usr/app

COPY . ./

RUN mvn -DskipTests=true clean package

FROM openjdk:8-jre-alpine

WORKDIR /usr/server

COPY --from=builder /usr/app/docker/app.jar ./app.jar

EXPOSE 8080

#CMD java -jar -Dspring.profiles.active=prod /usr/server/app.jar
ENTRYPOINT ["java", "-jar", "-XX:MaxRAM=256m", "-Dspring.profiles.active=prod", "/usr/server/app.jar"]