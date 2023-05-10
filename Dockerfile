FROM maven:3.8-jdk-11-slim

COPY ./SaludarPersona /usr/src/app

WORKDIR /usr/src/app

RUN mvn compile
