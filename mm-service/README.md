# Spring Boot GitHub Login API

A Spring Boot REST API that allows users to log in using GitHub authentication. It retrieves user details from the GitHub API and stores selected user data in a PostgreSQL database. The API also includes Swagger UI for easy documentation and testing.

## 🚀 Installation & Setup
### **1️⃣ Prerequisites**
- Java 21
- Maven 3.8+
- PostgreSQL 14+

### **2️⃣ Configure PostgreSQL**
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/github_users
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
```

### **3️⃣ Build & Run the Application**
```bash
mvn clean install
mvn spring-boot:run
```

## 🔑 Using the API
### **View API Documentation**
Once the application is running, open:
- **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **OpenAPI JSON:** [http://localhost:8080/api-docs](http://localhost:8080/api-docs)

## 📜 License
MIT License © 2025 Your Name

