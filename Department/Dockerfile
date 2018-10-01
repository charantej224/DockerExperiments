FROM openjdk:10-jre-slim
COPY ./Department/target/Department-0.0.1-SNAPSHOT.jar /usr
WORKDIR /usr/
EXPOSE 8090
CMD ["java","-jar","Department-0.0.1-SNAPSHOT.jar"]
