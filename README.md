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

## 🏗 Architecture Components

* **API Gateway:** Entry point for all clients using **Spring Cloud Gateway**, integrated with Keycloak for OIDC security.
* **Service Discovery:** **Netflix Eureka Server** (Secured) providing dynamic service registration and discovery.
* **Identity Provider:** **Keycloak** (OAuth2/OpenID Connect) for centralized authentication and RBAC.
* **Message Broker:** **Apache Kafka** & **Zookeeper** for asynchronous, event-driven service interaction.
* **Observability:** Distributed tracing implemented via **Zipkin** and **Micrometer**.
* **Database:** Decoupled **MySQL** instances for each service to maintain data sovereignty.

---

## 🛠 Infrastructure & Local Setup

### 1. Messaging Infrastructure
```bash
docker-compose up -d

2. Security (Keycloak Server)
Run Keycloak as a standalone container for centralized authentication and authorization:

Bash
docker run -d --name keycloak \
  -p 8080:8080 \
  -e KC_BOOTSTRAP_ADMIN_USERNAME=admin \
  -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin \
  quay.io/keycloak/keycloak:26.1.1 start-dev
3. Distributed Tracing (Zipkin)
Run Zipkin to visualize and troubleshoot request latencies across services:

Bash
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin
🔒 Security & Hardening
Eureka Security: The Discovery server is protected with Basic Authentication to prevent unauthorized service registration.

JWT Validation: The API Gateway acts as an OAuth2 Resource Server, validating incoming Bearer tokens against the Keycloak realm.

📈 Learning Roadmap
[x] Service Discovery: Implemented with Netflix Eureka.

[x] API Gateway: Routing and Security integration.

[x] Event-Driven Architecture: Messaging via Apache Kafka.

[x] Distributed Tracing: Observability with Zipkin.

[ ] Containerization: Moving all services to individual Docker images.

[ ] Fault Tolerance: Implementing Resilience4j Circuit Breakers.

[ ] DevOps: Building automated CI/CD pipelines.

🤝 Contact & Contribution
I am a Junior Backend Developer passionate about scalable architectures and cloud-native technologies. Feel free to reach out if you want to discuss Spring Boot, Microservices, or DevOps!

<p align="center">
<b>Developed with ❤️ by Kaung Htet Zaw</b>
</p>
