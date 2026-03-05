# Cloud-Sim Bank – Cloud Simulation with Microservices

## Architecture

![Architecture Diagram](Documentation/architecture_diagram.png)

This project simulates a cloud-native banking system using microservices and open-source tools.  
It demonstrates how distributed services, API gateways, and monitoring stacks interact in a realistic banking environment.

**Architecture Overview:**

- Client requests go through **Kong API Gateway**.
- Microservices handle business logic:
  - **Account Service** – Manages user accounts.
  - **Transaction Service** – Handles transactions between accounts.
  - **FastAPI** – Optional integration service exposed via Kong.
- **PostgreSQL** provides data persistence.
- **Prometheus + Grafana** monitor system metrics.
- **ELK Stack** (Elasticsearch, Logstash, Kibana) collects logs centrally.

---

## Project Structure
