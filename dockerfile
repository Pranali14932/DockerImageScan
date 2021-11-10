#base image
FROM openjdk:8
COPY src /src
WORKDIR /src/main/java
RUN ["javac","Hello.java"]
ENTRYPOINT ["java","Hello"]
~
