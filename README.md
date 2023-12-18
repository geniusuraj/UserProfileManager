# UserProfileManager

## Overview
UserProfileManager is a Spring Boot application designed for managing user profiles through CRUD (Create, Read, Update, Delete) operations. The application provides a RESTful web service interface and uses a MySQL database for data persistence.

## Features
- CRUD operations for user profiles.
- RESTful service endpoints.
- MySQL database integration.

## Prerequisites
- Java 17 or higher.
- Maven 3.6 or higher (for building the project).
- MySQL Database Server (configured and running).

## Setup and Installation
1. **Clone the Repository**:
- git clone [UserProfileManager](https://github.com/geniusuraj/UserProfileManager.git)
2. **Navigate to the Project Directory**:
3. **Configure MySQL Database**:
- Ensure MySQL server is running.
- Create a new database named `upm` (or a name of your choice).
- Update the `application.properties` file with your MySQL database details (username, password, and database URL).

4. **Build the Project Using Maven**:
5. **Run the Application**:

## Usage
Once the application is running, it will be accessible at `http://localhost:8080`.

### API Endpoints
- **Create User Profile**: `POST /user-profiles`
- **Retrieve All User Profiles**: `GET /user-profiles`
- **Retrieve User Profile by ID**: `GET /user-profiles/{id}`
- **Update User Profile**: `PUT /user-profiles/{id}`
- **Delete User Profile**: `DELETE /user-profiles/{id}`

You can interact with these endpoints using tools like Postman.

## Configuration
The application uses `application.properties` for configuration. It is pre-configured to connect to a MySQL database. Ensure that the MySQL database details in `application.properties` match your local setup.
