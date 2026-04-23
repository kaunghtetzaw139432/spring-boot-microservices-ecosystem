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

### 🏗 Architecture Design
<p align="center">
  <img src="https://raw.githubusercontent.com/kaunghtetzaw139432/spring-boot-microservices-ecosystem/main/images/architecture.jpg" width="800" alt="Architecture Diagram">
</p>

---

## 🏗 Key Components & Monitoring

### 1. Service Discovery (Eureka)
All services are registered and managed via Netflix Eureka Server.
<p align="center">
  <img src="https://raw.githubusercontent.com/kaunghtetzaw139432/spring-boot-microservices-ecosystem/main/images/eureka.png" width="800" alt="Eureka Dashboard">
</p>

### 2. Identity Management (Keycloak)
Centralized Authentication and Authorization using Keycloak OAuth2.
<p align="center">
  <img src="https://raw.githubusercontent.com/kaunghtetzaw139432/spring-boot-microservices-ecosystem/main/images/keycloak.jpg" width="600" alt="Keycloak Login">
</p>

### 3. API Testing & Verification
Verified successful transactions (Order creation and Product retrieval) via API Gateway.
<p align="center">
  <img src="https://raw.githubusercontent.com/kaunghtetzaw139432/spring-boot-microservices-ecosystem/main/images/api_result.png" width="800" alt="API Testing">
</p>

---

## 🛠 Infrastructure Setup

### 📡 Kafka & Zookeeper
```bash
docker-compose up -d
🔐 Keycloak Server
docker run -d --name keycloak \
  -p 8080:8080 \
  -e KC_BOOTSTRAP_ADMIN_USERNAME=admin \
  -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin \
  quay.io/keycloak/keycloak:26.1.1 start-dev

Tracing (Zipkin)
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin

🔒 Security & Hardening
.Eureka Security: Discovery server protected with Basic Authentication.

.JWT Validation: API Gateway acts as an OAuth2 Resource Server.

📈 Learning Roadmap
.[x] Service Discovery: Netflix Eureka integration.

.[x] API Gateway: Routing & Security.

.[x] Messaging: Asynchronous communication with Kafka.

.[x] Tracing: Observability with Zipkin.

.[ ] Containerization: Full Docker integration.

.[ ] Resilience: Circuit Breakers with Resilience4j.
<h3 align="center">🤝 Developed with ❤️ by Kaung Htet Zaw</h3>
