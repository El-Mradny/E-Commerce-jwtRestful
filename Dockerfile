FROM openjdk:8
COPY ./jwtRest-master/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","DemoApplication"]