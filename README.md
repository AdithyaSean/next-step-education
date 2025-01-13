# Next Step Education Service

## Overview
Education management service for the Next Step platform. Handles educational data, courses, streams, and career paths.

## Features
- Course management
- Stream information
- Career path data
- Educational requirements tracking
- Institution course offerings

## Tech Stack
- Spring Boot
- PostgreSQL
- JPA/Hibernate
- Spring Data REST

## Key Entities
- Streams
- Courses
- Careers
- Educational Requirements

## Setup
1. Configure environment variables:
   ```env
   SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/education_db
   SPRING_DATASOURCE_USERNAME=myuser
   SPRING_DATASOURCE_PASSWORD=secret
   GATEWAY_URL=http://localhost:8080
   EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://localhost:8761/eureka/
   ```

2. Start dependencies:
   ```bash
   docker-compose up -d
   ```

3. Run the service:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Documentation
See [docs/api.md](docs/api.md) for detailed API documentation.

## Database Schema
See [docs/database.md](docs/database.md) for database schema details.
