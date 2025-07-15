# User Management System

A simple User Management System built using **Java Spring Boot** that performs **CRUD operations** (Create, Read, Update, Delete) on user data stored in a **MySQL database**.

## Features

* Add new user
* View all users
* View user by ID
* Update existing user
* Delete user

## Technologies Used

* **Java** (Spring Boot)
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **RESTful APIs**

## Project Structure

```
src/
 └── main/
     ├── java/
     │   └── com/UMS/User_Management_System/
     │       ├── User.java
     │       ├── UserController.java
     │       ├── UserManagementSystemApplication.java(Main Application)
     │       ├── UserRepository.java
             ├── UserService.java
     └── resources/
         ├── application.properties
```

## API Endpoints

| Method | Endpoint      | Description       |
| ------ | ------------- | ----------------- |
| POST   | `/users`      | Create a new user |
| GET    | `/users`      | Get all users     |
| GET    | `/users/{id}` | Get user by ID    |
| PUT    | `/users/{id}` | Update user by ID |
| DELETE | `/users/{id}` | Delete user by ID |

## Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/Gopi-Kumar18/user_mng_system.git
   cd user_mng_system
   ```

2. **Configure MySQL database**
   Update `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

4. **Test the APIs**
   Use [Postman](https://www.postman.com/) or any REST client to test the endpoints.

## Example JSON for User

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "age": 25
}
```

## License

This project is open for educational and personal use.
