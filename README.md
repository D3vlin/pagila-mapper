# Pagila Mapper

## 📌 Overview
**Pagila Mapper** is one repository within a distributed, multi-repository architecture based on the Pagila sample database schema for PostgreSQL.  

This module contains the **mapping layer** responsible for transforming data between the persistence model (`entity`) and the transport model (`dto`).

It acts as the conversion boundary between internal database representations and external data contracts, ensuring strict separation between persistence and communication layers.

The overall ecosystem is structured to reflect real-world enterprise architecture patterns by dividing responsibilities into isolated, independently versioned repositories.

---

## 🎯 Purpose
This repository exists to:

- Convert Entity objects into DTOs
- Convert DTOs into Entity objects
- Centralize transformation logic
- Prevent leakage of persistence models
- Maintain strict module boundaries
- Provide reusable mapping components

Mappers in this architecture are primarily used when:

- returning data from services to APIs
- persisting incoming request payloads
- adapting domain objects between layers
- ensuring DTO/entity compatibility
- maintaining clean architecture principles

---

## 🧱 Project Architecture Context

This repository contains only the **Mapper module** of the Pagila ecosystem.

The full architecture is intentionally split across multiple repositories, where each module is independently versioned, published, and maintained.

Related modules live in separate repositories:

| Module | Responsibility        | Repository                              |
|--------|-----------------------|-----------------------------------------|
| dto    | Data transport        | https://github.com/D3vlin/pagila-dto    |
| entity | Database mapping      | https://github.com/D3vlin/pagila-entity |
| mapper | Object transformation | https://github.com/D3vlin/pagila-mapper |
| api    | REST interface        | https://github.com/D3vlin/pagila-api    |

---

### Architectural Philosophy

Each module is isolated in its own repository to achieve:

- independent versioning  
- loose coupling  
- clear boundaries  
- reusable artifacts  
- microservice readiness  
- simplified dependency graphs  

This repository specifically publishes the **transformation layer**, which sits between persistence and service/API layers.

---

## 🔄 Mapping Strategy

The mapper layer follows these principles:

- Explicit and controlled conversions
- No business logic inside mappers
- No database access
- No external API concerns
- Clear one-way or two-way mapping definitions
- Centralized transformation rules

Typical responsibilities include:

- Flattening entity relationships into DTO-friendly structures
- Handling nested object conversions
- Managing enum conversions
- Avoiding lazy-loading leaks
- Preparing clean response models

---

## 🚀 Why a Dedicated Mapper Module?

Separating mapping logic into its own artifact allows:

- Cleaner service layer code
- Isolation from ORM frameworks
- Easier testing of transformations
- Safer evolution of DTO contracts
- Decoupled persistence and API models
- Better maintainability in microservices

Without this separation, transformation logic tends to spread across services and controllers, increasing coupling and technical debt.

---

## 📚 Use Cases

This module is intended to be consumed by:

- service layers
- API modules
- integration services
- orchestration layers
- batch processing services

It should not contain business rules or persistence logic.

---

## 🔗 Dependency Usage (Maven)

```xml
<dependency>
    <groupId>co.d3vlin</groupId>
    <artifactId>pagila-mapper</artifactId>
    <version>1.0.0</version>
</dependency>
