FROM openjdk:11
VOLUME /temp
EXPOSE 8761
ADD ./target/hreureka-0.0.1-SNAPSHOT.jar hr-eureka-server.jar
ENTRYPOINT ["java", "-jar", "hr-eureka-server.jar"]