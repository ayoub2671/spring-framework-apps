# Spring Framework Apps

Two Spring Boot applications built with Java 21.

---

## Task 1 - Spring MVC App

### Description
A simple Spring MVC application using Thymeleaf template engine.

### How to run
1. Open the `task1` project in IntelliJ
2. Run `Task1Application.java`
3. Open browser at `http://localhost:8080`
<img width="829" height="276" alt="image" src="https://github.com/user-attachments/assets/ef3d1912-a5f7-4d07-b884-529f7e980072" />

### Endpoints
- `GET /` - Returns "Hello World!" text
- `GET /greeting` - Returns an HTML page with a greeting and image
- 
## Task 2 - REST API

### Description
A full REST API for managing products, built with Spring Boot, JPA, H2 database and Swagger UI.

### How to run
1. Open the `task2` project in IntelliJ
2. Run `Task2Application.java`
3. Open Swagger UI at `http://localhost:8080/swagger-ui/index.html`

### Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| POST | /api/v1/products | Create a new product |
| GET | /api/v1/products | Get all products |
| GET | /api/v1/products/{id} | Get product by ID |
| PUT | /api/v1/products/{id} | Update product by ID |
| DELETE | /api/v1/products/{id} | Delete product by ID |

### Example Request (POST)
```json
{
    "name": "Laptop"
}
```

### Example Response
```json
{
    "id": 1,
    "name": "Laptop"
}
```
