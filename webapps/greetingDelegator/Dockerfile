FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN ./mvnw clean install
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]
