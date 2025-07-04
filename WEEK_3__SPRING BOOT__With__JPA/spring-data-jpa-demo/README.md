# Spring Data JPA Demo

This is a simple Spring Boot project demonstrating the use of Spring Data JPA with a `Student` entity.

## Features

- `@Entity` for database mapping
- `JpaRepository` for CRUD operations
- REST endpoints using `@RestController`

## Setup

1. Ensure MySQL is running and create a database named `demo`.
2. Update your username and password in `application.properties`.
3. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```
4. Test endpoints using Postman or curl:
    - POST `/students`
    - GET `/students`