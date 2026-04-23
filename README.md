<h1 align="center">🚀 Java Spring Boot Microservices Ecosystem</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Keycloak-000000?style=for-the-badge&logo=keycloak&logoColor=white" />
  <img src="https://img.shields.io/badge/Apache_Kafka-231F20?style=for-the-badge&logo=apache-kafka&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
</p>

---

## 📝 Project Overview
This repository contains a full-scale **Microservices Architecture** developed using **Java Spring Boot**. The project demonstrates a production-ready ecosystem focusing on distributed systems, event-driven communication, and centralized security.

---

## 🏗 System Architecture
<p align="center">
  <img src="https://github.com/user-attachments/assets/4dc3e26d-e695-4071-8afc-22fbb9e300c8" width="100%" alt="Architecture Diagram">
</p>

---

## 🛠 Tech Stack

| Category | Technology |
| :--- | :--- |
| **Backend** | Java 17, Spring Boot 3.x, Spring Cloud |
| **Security** | Keycloak (OIDC/OAuth2), Spring Security |
| **Messaging** | Apache Kafka, Zookeeper |
| **Database** | MySQL (Relational), MongoDB (NoSQL) |
| **Discovery** | Netflix Eureka Server |
| **Tracing** | Zipkin, Micrometer |
| **DevOps** | Docker, Docker Compose |

---

## 📂 Project Structure

```text
.
├── api-gateway/          # Central entry point & Auth filter
├── discovery-server/     # Eureka Service Discovery
├── auth-service/         # Identity Provider (Keycloak integration)
├── product-service/      # Product management (MongoDB)
├── order-service/        # Order processing (MySQL)
├── inventory-service/    # Stock management (MySQL)
├── notification-service/ # Async notifications via Kafka
├── docker-compose.yml    # Infrastructure orchestration
└── pom.xml               # Parent dependencies 
```
---

## 🏗 Key Components & Monitoring

### 1. Service Discovery (Eureka)
All services are registered and managed via Netflix Eureka Server.
<p align="center">
  <img src="https://github.com/user-attachments/assets/56ba7512-d920-4061-9b44-ce8c01972df0"  width="800" alt="Eureka Dashboard">
</p>

### 2. Identity Management (Keycloak)
Centralized Authentication and Authorization using Keycloak OAuth2.
<p align="center">
  <img src="https://github.com/user-attachments/assets/4dc3e26d-e695-4071-8afc-22fbb9e300c8" width="600" alt="Keycloak Login">
</p>

### 🧪 3. API Testing & Verification

Verified successful transactions (Authentication, Order creation, and Product retrieval) via API Gateway.

<p align="center">
  <img src="https://github.com/user-attachments/assets/813e35dd-59f0-4a1a-be0b-84bbbad92496" width="45%" alt="Auth Result">
  <img src="https://github.com/user-attachments/assets/fa575985-5d93-43fd-8ef2-6fceeaad9ea0" width="45%" alt="Order Success">
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/56036a4c-2a57-43ee-b5ca-58d2d5224e4d" width="80%" alt="Product List">
</p>


---

## 🛠 Infrastructure Setup

### 📡 Kafka & Zookeeper
```bash
docker-compose up -d
 `🔐 Keycloak Server`
docker run -d --name keycloak \
  -p 8080:8080 \
  -e KC_BOOTSTRAP_ADMIN_USERNAME=admin \
  -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin \
  quay.io/keycloak/keycloak:26.1.1 start-dev
```
### 📊 Tracing (Zipkin)
`docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin`
🔒 Security & Hardening
- Eureka Security: Discovery server protected with Basic Authentication.

- JWT Validation: API Gateway acts as an OAuth2 Resource Server, validating tokens against Keycloak.
📈 Learning Roadmap
- [x] Service Discovery: Netflix Eureka integration.

- [x] API Gateway: Routing & Security.

- [x] Messaging: Asynchronous communication with Kafka.

- [x] Tracing: Observability with Zipkin.

- [ ] Containerization: Full Docker integration.

- [ ] Resilience: Circuit Breakers with Resilience4j.

<h3 align="center">🤝 Developed with ❤️ by Kaung Htet Zaw</h3>
