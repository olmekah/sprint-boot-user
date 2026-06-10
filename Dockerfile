
#  Curso Spring y MicroServicios
#  www.dcinternet.com.mx

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/sprint-boot-user-0.0.1-SNAPSHOT.jar app-user.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app-user.jar"]