FROM openjdk:8-jdk-alpine

# docker build --build-arg SPRING_PROFILE=xxx
ENV SPRING_PROFILE=dev
#ENV SPRING_PROFILE=local-docker

# 定義 timezone
ENV TZ=Asia/Taipei

# 在映像檔建立目錄：/usr/app/fet-modules
WORKDIR /usr/app/fet-modules

# 將當前目錄下的 target 目錄所有 jar 檔複製到映像檔的 /usr/app/fet-modules 目錄下
COPY target/*.jar .

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILE}", "-jar", "/usr/app/fet-modules/temp-1.0-SNAPSHOT.jar"]