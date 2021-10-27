FROM openjdk:17-jdk-slim
# VOLUME /tmp
COPY target/webflux-hw*jar app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080
