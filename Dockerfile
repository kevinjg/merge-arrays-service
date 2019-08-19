FROM openjdk:11

COPY ./target/merge-arrays-service-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch merge-arrays-service-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","merge-arrays-service-0.0.1-SNAPSHOT.jar"]