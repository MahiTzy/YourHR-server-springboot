# YourHR Backend Service (Spring Boot + H2 Database)

### Table of Contents

1. [Overview](#overview)
2. [Architecture](#architecture)
3. [Project Structure](#project-structure)
4. [Database Configuration](#database-configuration)
5. [API Endpoints](#api-endpoints)
7. [Running the Application](#running-the-application)

### Overview

The backend of the **YourHR** application is built using **Spring Boot** and an **H2 in-memory database**. It provides RESTful API endpoints for the frontend to interact with, allowing job seekers to submit their information and resumes. The application is designed to be lightweight and easy to set up, making it ideal for development and testing environments.

### Architecture

The backend architecture follows a standard MVC (Model-View-Controller) pattern:

- **Model**: Represents the data structure. In this case, the `User` entity that will be stored in the H2 database.
- **Repository**: Interacts with the H2 database to perform CRUD operations.
- **Service**: Contains the business logic for handling user data and processing requests.
- **Controller**: Defines API endpoints and handles HTTP requests and responses.

### Project Structure

```
/src
|-- main
|   |-- java
|   |   |-- com.yourhr
|   |   |   |-- controller
|   |   |   |   |-- UserController.java
|   |   |   |-- model
|   |   |   |   |-- User.java
|   |   |   |-- repository
|   |   |   |   |-- UserRepository.java
|   |   |   |-- service
|   |   |   |   |-- UserService.java
|   |-- resources
|       |-- application.properties
|-- test
    |-- java
        |-- com.yourhr
            |-- UserControllerTest.java
```

### Database Configuration

The application uses an H2 in-memory database, which is configured in the `application.properties` file:

```properties
# application.properties

spring.datasource.url=jdbc:h2:mem:yourhr
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

This configuration allows the H2 console to be accessed at `http://localhost:8080/h2-console`.

### API Endpoints

Here is the API endpoints provided by the backend:

- **POST /saveUser**: Accepts user data (name, email, phone, resume) and saves it to the H2 database.

### Running the Application

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/MahiTzy/YourHR-server-springboot.git
   cd YourHR-server-springboot
   ```

2. **Run the Application**:

   ```bash
   ./mvnw spring-boot:run
   ```

   The backend server should now be running on `http://localhost:8080`.
