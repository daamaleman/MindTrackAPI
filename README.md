<div style="text-align:center;">

# 🌿 MindTrack API

<p>
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.6-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21" />
  <img src="https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge" alt="Status" />
</p>

<img src="https://via.placeholder.com/1200x280.png?text=MindTrack+API" alt="MindTrack API banner" />

<p><em>Una API REST minimalista para registrar, consultar y gestionar sesiones de seguimiento emocional. ✨</em></p>

</div>

---

## 📌 Resumen

**MindTrack API** es una API REST construida con **Spring Boot** para gestionar sesiones de seguimiento emocional.

### ✨ Lo que permite

- 🧑 Asociar sesiones a un usuario
- 😊 Registrar el estado de ánimo
- 📝 Guardar notas de seguimiento
- 🔎 Consultar, crear y actualizar sesiones

---

## 🧱 Arquitectura

El proyecto usa una estructura por capas, clara y mantenible:

<table>
  <tr>
    <th>Capa</th>
    <th>Responsabilidad</th>
  </tr>
  <tr>
    <td><code>models</code></td>
    <td>Entidad JPA <code>TrackSession</code></td>
  </tr>
  <tr>
    <td><code>repository</code></td>
    <td>Acceso a datos con <code>JpaRepository</code></td>
  </tr>
  <tr>
    <td><code>services</code></td>
    <td>Lógica de negocio</td>
  </tr>
  <tr>
    <td><code>controllers</code></td>
    <td>Exposición de endpoints REST</td>
  </tr>
</table>

---

## ⚙️ Tecnologías

- ☕ **Java 21**
- 🚀 **Spring Boot 4.0.6**
- 🗃️ **Spring Data JPA**
- 🐘 **PostgreSQL**
- 🧩 **Lombok**
- 🧪 **Spring Boot Test**

---

## 📂 Estructura del proyecto

```bash
mindtrack-api/
├── src/
│   ├── main/
│   │   ├── java/ni/edu/uam/mindtrack_api/
│   │   │   ├── MindtrackApiApplication.java
│   │   │   ├── controllers/
│   │   │   │   └── TrackSessionController.java
│   │   │   ├── models/
│   │   │   │   └── TrackSession.java
│   │   │   ├── repository/
│   │   │   │   └── TrackSessionRepo.java
│   │   │   └── services/
│   │   │       └── TrackSessionService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/ni/edu/uam/mindtrack_api/
│           └── MindtrackApiApplicationTests.java
├── pom.xml
└── README.md
```

---

## 🔌 Configuración

### Requisitos

- Java 21
- Maven
- PostgreSQL
- Base de datos local: `mindtrack_db`

### `application.properties`

```properties
spring.application.name=mindtrack_api
server.port=8080

spring.datasource.url=jdbc:postgresql://localhost:5432/mindtrack_db
spring.datasource.username=postgres
spring.datasource.password=123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

> ⚠️ Recomendación: en producción, usa variables de entorno para las credenciales.

---

## ▶️ Ejecución

### Linux / macOS

```bash
./mvnw spring-boot:run
```

### Windows PowerShell

```powershell
.\mvnw.cmd spring-boot:run
```

Una vez iniciada, la API estará disponible en:

```bash
http://localhost:8080
```

---

## 📡 Endpoints

### Base URL

```bash
/api/sessions
```

### Operaciones disponibles

| Método | Endpoint | Descripción |
|-------|----------|-------------|
| GET | `/api/sessions` | Listar todas las sesiones |
| GET | `/api/sessions/{id}` | Obtener una sesión por ID |
| POST | `/api/sessions` | Crear una nueva sesión |
| PUT | `/api/sessions/{id}` | Actualizar una sesión existente |

---

## 🧪 Ejemplo de uso

### Crear una sesión

```http
POST /api/sessions
Content-Type: application/json
```

```json
{
  "idUsuario": 1,
  "estadoAnimo": "Feliz",
  "notas": "Tuve un día tranquilo y productivo."
}
```

### Respuesta esperada

```json
{
  "id": 1,
  "idUsuario": 1,
  "estadoAnimo": "Feliz",
  "notas": "Tuve un día tranquilo y productivo."
}
```

---

## 🧠 Modelo principal

La entidad `TrackSession` contiene:

- `id` → identificador autogenerado
- `idUsuario` → usuario asociado
- `estadoAnimo` → estado emocional registrado
- `notas` → observaciones de la sesión

---

## ✅ Puntos clave

- Arquitectura limpia por capas
- Separación entre controlador, servicio y repositorio
- Persistencia con JPA
- Configuración simple para desarrollo local
- Uso de Lombok para reducir boilerplate

---

## 🧪 Pruebas

```bash
./mvnw test
```

### Windows PowerShell

```powershell
.\mvnw.cmd test
```

---

## 📄 Licencia

Este proyecto no incluye una licencia definida todavía.

---

<div style="text-align:center;">

💚 Diseñado con simplicidad, claridad y enfoque en una experiencia limpia.

</div>

