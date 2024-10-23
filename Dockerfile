FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /land
COPY . .
RUN ./gradlew clean bootJar

FROM eclipse-temurin:17-jre-alpine AS run
COPY --from=build /land/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]