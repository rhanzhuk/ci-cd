FROM openjdk:8
COPY target/check-status-0.0.1-SNAPSHOT.jar /usr/src/check-status/
WORKDIR /usr/src/check-status/
CMD java -jar check-status-0.0.1-SNAPSHOT.jar