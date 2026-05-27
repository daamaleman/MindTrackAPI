# Etapa 1: Construcción (Build)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
# Copiamos los archivos de configuración y el código fuente
COPY pom.xml .
COPY src ./src
# Compilamos el proyecto omitiendo las pruebas para que sea más rápido
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución (Run)
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
# Copiamos el archivo .war generado en la etapa anterior
COPY --from=build /app/target/*.war app.war

# Exponemos el puerto que usa Spring Boot
EXPOSE 8080

# Comando para arrancar el API
ENTRYPOINT ["java", "-jar", "app.war"]