# Demo Spring Boot Application with Dependency Injection

This is a basic Spring Boot application that demonstrates how to use dependency injection using a service class.

## 📦 Project Structure

```
demo-di/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/demo/
│       │       ├── DemoApplication.java
│       │       ├── HelloController.java
│       │       └── MessageService.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Steps to Run

1. **Clone or extract the project.**

2. **Navigate to the project directory** in your terminal:

```bash
cd demo-di
```

3. **Run the application using Maven:**

```bash
mvn spring-boot:run
```

4. **Open your browser** and visit:

```
http://localhost:8080
```

You should see:

```
Welcome to Spring Boot with Dependency Injection!
```

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 💡 Description

- `MessageService.java` - Contains business logic (a simple message).
- `HelloController.java` - REST controller that uses dependency injection to call the service.
- `DemoApplication.java` - Main class to run the Spring Boot app.

---
