FROM eclipse-temurin:17

LABEL maintainer = "mvpvictim@gmail.com"

WORKDIR /app

COPY target/basalt-accounting-module-0.0.1-SNAPSHOT /app/basalt-accounting-module.jar

ENTRYPOINT ["java", "-jar", "basalt-accounting-module.jar"]
