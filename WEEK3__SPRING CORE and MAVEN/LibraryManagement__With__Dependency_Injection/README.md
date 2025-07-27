# LibraryManagement

This project demonstrates Spring's Inversion of Control (IoC) and Dependency Injection (DI) using XML-based configuration.

## Features
- Spring IoC container with XML configuration.
- Dependency injection using setter method between `BookService` and `BookRepository`.

## How to Run
1. Import the project into your IDE.
2. Run `LibraryManagementApplication.java`.
3. You should see output like:
   ```
   BookService: delegating to repository...
   Saving book: Spring in Action
   ```

## Structure
- `BookService`: Service class with a setter for `BookRepository`.
- `BookRepository`: Repository class that handles saving logic.
- `applicationContext.xml`: Configures Spring beans and DI relationships.
