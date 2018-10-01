FROM adoptopenjdk/openjdk8:latest
COPY ./target/employee-0.0.1-SNAPSHOT.jar /usr/
WORKDIR /usr
EXPOSE 8090
CMD ["java","-jar","employee-0.0.1-SNAPSHOT.jar"]
