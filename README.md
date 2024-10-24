# Crud-Operations-With-SpringBoot-RestApi

This project implements a RESTful API for managing user data, including creating, reading, updating, and deleting user information using Spring Boot.

## Features
- Create a new user
- Retrieve user details
- Update user information
- Delete a user

## Technologies Used
- Spring Boot
- Java
- Maven
- Postman for testing
- MySQL )

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone <your-repo-url>
   cd crud-user-data
Open the project in your Eclipse IDE.

## Configure Database, If you're using MySQL for persistence, configure your database settings in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Build the Project Use Maven to build the project.

bash
Copy code
mvn clean install
Run the Application Run the application. The server will start on http://localhost:8080.

## API Endpoints
Method	Endpoint	Description
POST	/users	Create a new user
GET	/users/{id}	Get user details by ID
PUT	/users/{id}	Update user information
DELETE	/users/{id}	Delete a user
GET	/users	Retrieve all users

##  Testing with Postman
- 1. Create User
Method: POST
URL: http://localhost:8080/users
Body: Select raw and choose JSON.

Example:
{
    "name": "Darshan",
    "address": "New York",
    "contact": "675867"
}

- 2. Retrieve User by ID
Method: GET
URL: http://localhost:8080/users/{id} (replace {id} with the actual user ID).

- 3. Update User
Method: PUT
URL: http://localhost:8080/users/{id}
Body: Select raw and choose JSON

Example:
{
    "id": "1",
    "name": "Darshan",
    "address": "Mumbai",
    "contact": "675867"
}

- 4. Delete User
Method: DELETE
URL: http://localhost:8080/users/{id} (replace {id} with the actual user ID).

- 5. Retrieve All Users
Method: GET
URL: http://localhost:8080/users
