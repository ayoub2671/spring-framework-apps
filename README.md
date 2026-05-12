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

### Endpoints
- `GET /` - Returns "Hello World!" text
- `GET /greeting` - Returns an HTML page with a greeting and image

### Screenshots
<img width="378" height="144" alt="image" src="https://github.com/user-attachments/assets/8ce89c66-dbc9-4afd-a0dd-247dc454a856" />

<img width="622" height="379" alt="image" src="https://github.com/user-attachments/assets/1c52b28a-dc20-456a-95bb-c104f9f6cce7" />


---

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
    "name": "Ayoub"
}
```

### Example Response
```json
{
    "id": 1,
    "name": "Ayoub"
}
```

### Screenshots
<img width="1911" height="957" alt="image" src="https://github.com/user-attachments/assets/aa7d7a6e-3e4a-48f9-8086-f0279cbe75ef" />

<img width="1323" height="855" alt="image" src="https://github.com/user-attachments/assets/c60d191f-fbe6-4b24-8791-2f694836f46f" />

<img width="1343" height="881" alt="image" src="https://github.com/user-attachments/assets/b2134276-cfbc-4140-a43b-a5e92d23048b" />
