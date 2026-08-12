# ACT Versiones API
Actividad para construir, versionar y mantener un microservicio básico en Spring Boot.

---

## Ejecución

1. Clonar el repositorio:

- bash
git clone https://github.com/Mayckol2005/ACT_VersionamintoApi.git
cd ACT_VersionamintoApi


2. Ejecutar el proyecto con Maven:

- bash
./mvnw spring-boot:run


La API quedará disponible en:

- http://localhost:8080

## Endpoints

Método: GET - Endpoint: `/api/v1` - Descripción: Obtiene un mensaje de saludo - Respuesta: `Hola Mundo`

Método: POST - Endpoint: `/api/v1` - Descripción: Obtiene un mensaje de despedida - Respuesta: `Chao Planeta Tierra`

## Ejemplos

**GET**

- http
GET http://localhost:8080/api/v1

Respuesta:

- Hola Mundo

**POST**

- http
POST http://localhost:8080/api/v1


Respuesta:


- Chao Planeta Tierra
