FROM adoptopenjdk/openjdk11
RUN ./gradlew build && java -jar build/derek19960312/sarebi-server-0.1.0.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]