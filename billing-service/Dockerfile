FROM gradle:8.7-jdk21 AS builder

WORKDIR /app
COPY build.gradle settings.gradle ./
RUN gradle dependencies --no-daemon || true
COPY . .
RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:21-jdk AS runner
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 4001
EXPOSE 9001
ENTRYPOINT ["java","-jar","app.jar"]