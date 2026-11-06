# 🍃 Foodies API - Spring Boot REST Service

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.3-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![AWS S3](https://img.shields.io/badge/AWS_S3-FF9900?style=for-the-badge&logo=amazons3&logoColor=white)](https://aws.amazon.com/s3/)
[![Razorpay](https://img.shields.io/badge/Razorpay-02042B?style=for-the-badge&logo=razorpay&logoColor=0082FB)](https://razorpay.com/)

> **Developer & Maintainer:** [Gaurav Kalamkhede](https://github.com/gauravkal006)  
> **Package:** `com.gaurav.foodiesapi`  
> Part of the [Foodies Online Food Delivery Platform](https://github.com/gauravkal006/online-food-delivery-project).

---

## 📌 Architecture & Layers

- **`config/`**: Security filter chain with CORS configuration & AWS S3 client builder.
- **`controller/`**: REST controllers exposing endpoints for Authentication, Foods, Cart, Orders, and Users.
- **`entity/`**: MongoDB document models (`FoodEntity`, `CartEntity`, `OrderEntity`, `UserEntity`).
- **`filters/`**: `JwtAuthenticationFilter` validating Bearer JWT tokens on incoming requests.
- **`io/`**: Request and Response DTOs.
- **`repository/`**: Spring Data MongoDB repository interfaces.
- **`service/`**: Business logic implementations for food management, user details, cart synchronization, and order creation.
- **`util/`**: `JwtUtil` handling token creation, claims extraction, and expiration validation.

---

## ⚙️ Configuration Properties

Set the following environment variables or configure `src/main/resources/application.properties`:

```properties
spring.application.name=foodiesapi
spring.data.mongodb.uri=mongodb://localhost:27017/foodies

aws.access.key=${AWS_ACCESS_KEY}
aws.secret.key=${AWS_SECRET_KEY}
aws.region=${AWS_REGION}
aws.s3.bucketname=${AWS_BUCKET_NAME}

jwt.secret.key=${JWT_SECRET}

razorpay_key=${RAZORPAY_KEY}
razorpay_secret=${RAZORPAY_SECRET}
```

---

## 🚀 Running the API

### Windows
```cmd
mvnw.cmd spring-boot:run
```

### Linux / macOS
```bash
./mvnw spring-boot:run
```
Service runs on port `8080`.
