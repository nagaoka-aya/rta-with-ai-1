# My Spring Boot Application

This is a simple Spring Boot web application that demonstrates the use of Spring Boot, MyBatis, Thymeleaf, and H2 database.

## Project Structure

```
my-spring-boot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── myapp
│   │   │               ├── MySpringBootApplication.java
│   │   │               ├── controller
│   │   │               │   └── MyController.java
│   │   │               ├── service
│   │   │               │   └── MyService.java
│   │   │               └── repository
│   │   │                   └── MyRepository.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── myapp
│                       └── MySpringBootApplicationTests.java
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd my-spring-boot-app
   ```

2. **Run the application:**
   You can run the application using the Maven wrapper:
   ```
   ./mvnw spring-boot:run
   ```
   For Windows:
   ```
   mvnw.cmd spring-boot:run
   ```

3. **Access the application:**
   Open your web browser and navigate to `http://localhost:8080`.

## Usage Guidelines

- The application has a simple controller that serves an index page.
- You can modify the `MyService` class to add your business logic.
- The `MyRepository` interface can be extended to include custom database operations.

## Dependencies

This project uses the following dependencies:
- Spring Boot
- MyBatis
- Thymeleaf
- H2 Database

## Testing

To run the tests, use the following command:
```
./mvnw test
```
For Windows:
```
mvnw.cmd test
```

## License

This project is licensed under the MIT License.