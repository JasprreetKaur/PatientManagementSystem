FROM gradle:9.8-jdk25 AS builder

WORKDIR /app
COPY build.gradle settings.gradle ./
RUN gradle dependencies --no-daemon || true
COPY . .
RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:25-jre AS runner
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 4001
EXPOSE 9001
ENTRYPOINT ["java","-jar","app.jar"]