
#  Curso Spring y MicroServicios  and git
#  www.dcinternet.com.mx

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/*.jar app-user.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app-user.jar"]