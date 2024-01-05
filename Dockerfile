FROM openjdk:11

COPY target/SbDockerFile.jar SbDockerFile.jar 


ENTRYPOINT ["java","-jar","SbDockerFile.jar" ]

EXPOSE 8084