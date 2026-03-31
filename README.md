# 🚀 Spring Boot REST API — User Management

A production-ready RESTful backend service built with Java 17 and Spring Boot 3, featuring JWT authentication and role-based access control.

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java 17 |
| Framework | Spring Boot 3 |
| Security | Spring Security + JWT |
| Database | PostgreSQL |
| ORM | Spring Data JPA + Hibernate |
| Migrations | Liquibase |
| Container | Docker + Docker Compose |
| Build | Maven |

## Features

- ✅ User registration and login with JWT tokens
- ✅ Role-based access control (ADMIN / USER)
- ✅ Full CRUD for user management
- ✅ Input validation with detailed error responses
- ✅ Database migrations with Liquibase
- ✅ Dockerized — runs with one command

## Getting Started

### Prerequisites
- Docker & Docker Compose installed

### Run with Docker
```bash
git clone https://github.com/erkyn-seitkali/spring-boot-rest-api.git
cd spring-boot-rest-api
docker-compose up
```

API available at: `http://localhost:8080`

### Run locally
```bash
# Set up PostgreSQL locally, then:
./mvnw spring-boot:run
```

## API Endpoints

### Auth
| Method | URL | Description |
|--------|-----|-------------|
| POST | `/api/auth/register` | Register new user |
| POST | `/api/auth/login` | Login, get JWT token |

### Users (requires JWT)
| Method | URL | Role | Description |
|--------|-----|------|-------------|
| GET | `/api/users` | ADMIN | Get all users |
| GET | `/api/users/{id}` | USER/ADMIN | Get user by ID |
| PUT | `/api/users/{id}` | USER/ADMIN | Update user |
| DELETE | `/api/users/{id}` | ADMIN | Delete user |

## Example Request

```bash
# Register
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{"username": "john", "email": "john@example.com", "password": "secret123"}'

# Login
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"email": "john@example.com", "password": "secret123"}'

# Use token
curl http://localhost:8080/api/users \
  -H "Authorization: Bearer YOUR_JWT_TOKEN"
```

## Project Structure

```
src/main/java/com/erkyn/userapi/
├── controller/       # REST controllers
├── service/          # Business logic
├── repository/       # JPA repositories
├── model/            # JPA entities
├── dto/              # Request/Response DTOs
├── security/         # JWT filter, UserDetails
└── config/           # Security config, beans
```

## Author

**Shynggys Yerkyn** — Java Backend Developer  
4+ years of experience building enterprise systems  
[Upwork Profile](https://www.upwork.com/freelancers/~018fdbe1fac2e67ea8?mp_source=share) | [LinkedIn](www.linkedin.com/in/shynggys-yerkyn-a8a078254)
