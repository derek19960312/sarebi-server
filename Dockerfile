FROM adoptopenjdk/openjdk11
EXPOSE 8080
RUN gradle wrapper && ./gradlew build -x test
ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]