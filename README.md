# User Management System
## Language and Framework

![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Description

Welcome to the User Management System repository! This open-source project is a Java-based application built using the Spring Boot framework. The User Management System allows users to manage application users through a set of APIs. With these APIs, users can perform various operations such as adding users, updating user information (including all properties), deleting users, retrieving users by their user ID, and retrieving a list of all users.

## Project Structure

The project is organized into several parts, each serving a specific purpose:

### 1. Configuration

In this section, you'll find the configuration class for the database. Note that in this project, we're using a `HashMap` as a simulated database, with user IDs as keys and user objects as values.

### 2. Entities

This section contains the `User` class, which represents the core entity of the system. The `User` class includes the following properties:

- `userId` (Integer): Unique identifier for each user.
- `name` (String): User's full name.
- `userName` (String): User's username.
- `address` (String): User's address.
- `phoneNumber` (String): User's phone number.

### 3. Repository

In this section, you'll find the class responsible for interacting with the database (HashMap) and performing CRUD (Create, Read, Update, Delete) operations on user data.

### 4. Services

The Services section includes a set of service classes that the API Controller class uses to handle user management operations. The list of services includes:

- `addUser`: Adds a new user to the system.
- `getUser`: Retrieves user information by user ID.
- `getAllUser`: Retrieves a list of all users in the system.
- `updateUserInfo`: Updates user information, allowing for changes to name, username, address, and phone number.
- `deleteUser`: Deletes a user by their user ID.

### 5. Controller

This section houses the `APIController` class, which provides API endpoints for interacting with the User Management System. Here is a list of available endpoints:

- `POST /userMan/user`: Adds a new user. Accepts a user object in the request body.
- `GET /userMan/user/{userId}`: Retrieves user information by user ID.
- `GET /userMan/allUsers`: Retrieves a list of all users.
- `PUT /userMan/userInfo`: Updates user information. Accepts user ID and optional parameters for name, username, address, and phone number.
- `DELETE /userMan/user/{userId}`: Deletes a user by user ID.

## Data Flow
As soon as user hit any API the Controller handel it and Call the respective service, In Services section the buisness logic is applied and if the data base interaction required it hit the repository section. In repository section the data base interation take place
## Getting Started

To get started with the User Management System, follow the instructions in the [Installation](#installation) section below.

### Prerequisites

Make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven
- Spring Boot Dependecy

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/user-management-system.git
   
2. Navigate to the project directory

    ```bash
    cd user-management-system

## Usage

To use the User Management System, you can make HTTP requests to the provided API endpoints using your favorite API testing tool or framework.
