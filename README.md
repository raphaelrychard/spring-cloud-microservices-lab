# SPRING-CLOUD-MICROSERVICES-LAB

<em>Empower microservices innovation with Spring Cloud magic.</em>

![license](https://img.shields.io/github/license/raphaelrychard/spring-cloud-microservices-lab?style=default&logo=opensourceinitiative&logoColor=white&color=blue)
![last-commit](https://img.shields.io/github/last-commit/raphaelrychard/spring-cloud-microservices-lab?style=default&logo=git&logoColor=white&color=blue)
![repo-top-language](https://img.shields.io/github/languages/top/raphaelrychard/spring-cloud-microservices-lab?style=default&color=blue)
![repo-language-count](https://img.shields.io/github/languages/count/raphaelrychard/spring-cloud-microservices-lab?style=default&color=blue)

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

---

## Overview

**Why spring-cloud-microservices-lab?**

This project simplifies microservices development and deployment with a focus on efficiency and scalability. The core features include:

- 🚀 **Comprehensive Docker Setup:** Simplify multi-container applications with Docker Compose.
- 💡 **Efficient Maven Management:** Streamline project setup and dependencies with Maven wrapper scripts.
- 🔗 **Seamless Service Communication:** Utilize Feign client interface for smooth inter-service interactions.
- ⏰ **Scheduled Task Notifications:** Enhance task management with scheduled notifications.

---

## Features

| Component | Details |
| :--- | :--- |
| ⚙️ **Architecture** | Microservices architecture using Spring Cloud, service discovery with Eureka, API Gateway with Zuul |
| 🔩 **Code Quality** | Consistent coding style across services, usage of Lombok for reducing boilerplate code |
| 📄 **Documentation** | Well-documented Docker setup in docker-compose.yaml, individual service Dockerfiles for clarity |
| 🔌 **Integrations** | Integration with Spring Cloud Config Server for externalized configuration, inter-service communication using Feign clients |
| 🧩 **Modularity** | Each service encapsulates specific business logic, clear separation of concerns between services |
| 🧪 **Testing** | Unit tests for critical business logic in each service, integration tests for service interactions |
| ⚡️ **Performance** | Optimized service-to-service communication, caching strategies implemented for improved response times |
| 🛡️ **Security** | Secure communication between services using HTTPS, role-based access control implemented |
| 📦 **Dependencies** | Utilizes Spring Cloud dependencies for cloud-native features, Java-based dependencies managed via Maven |

---

## Project Structure

```
└── spring-cloud-microservices-lab/
    ├── docker-compose.yaml
    ├── service.main
    │   ├── .gitattributes
    │   ├── .gitignore
    │   ├── .mvn
    │   ├── Dockerfile
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    ├── service.notification
    │   ├── .gitattributes
    │   ├── .gitignore
    │   ├── .mvn
    │   ├── Dockerfile
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    └── service.task
        ├── .gitattributes
        ├── .gitignore
        ├── .mvn
        ├── Dockerfile
        ├── mvnw
        ├── mvnw.cmd
        ├── pom.xml
        └── src
```

### Project Index

<details open>
<summary><b>SPRING-CLOUD-MICROSERVICES-LAB/</b></summary>

<details>
<summary><b>Root</b></summary>

| File | Summary |
| :--- | :--- |
| [docker-compose.yaml](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/docker-compose.yaml) | Define services and networks for a multi-container application using Docker Compose. Services include main, notification, and tasks, each with specific build contexts and ports. Dependencies ensure services start in the correct order. The network configuration uses a bridge driver for communication between services. |

</details>

<details>
<summary><b>service.main</b></summary>

| File | Summary |
| :--- | :--- |
| [pom.xml](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.main/pom.xml) | Define project dependencies and configurations using Maven. Manages Spring Boot and Spring Cloud dependencies, plugin configurations, and Java version. Sets up web MVC, config server, Eureka server, and Lombok for the project. |
| [mvnw.cmd](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.main/mvnw.cmd) | Install and configure Apache Maven using the provided script. Downloads the Maven distribution, validates it, and sets up the environment variables. |
| [mvnw](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.main/mvnw) | Initiate Apache Maven Wrapper setup script to download and install Maven distribution based on specified configurations. |
| [Dockerfile](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.main/Dockerfile) | Create a Docker image for the main service by building and packaging the application using Maven. Exposes the service on port 8888. |
| [Application.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.main/src/main/java/com/raphaelrychard/service/main/Application.java) | Enable Eureka and Config servers for the main service application. Initializes the Spring Boot application for service registration, discovery, and centralized configuration management. |

</details>

<details>
<summary><b>service.task</b></summary>

| File | Summary |
| :--- | :--- |
| [pom.xml](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/pom.xml) | Define project dependencies and configurations for a Spring Boot application. Manages versions and plugins for seamless integration with Spring Cloud services. |
| [mvnw.cmd](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/mvnw.cmd) | Initialize and install Apache Maven using the provided batch script. |
| [mvnw](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/mvnw) | Facilitates Apache Maven Wrapper setup by downloading and installing Maven distributions. |
| [Dockerfile](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/Dockerfile) | Create a Dockerfile to build and run the service.tasks application. Runs the JAR file on port 8081 using Amazon Corretto. |
| [TasksEntity.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/TasksEntity.java) | Define the entity structure for tasks, including fields like title, email, deadline, and notification status. Maps to the database table `task`. |
| [TasksControllers.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/TasksControllers.java) | Handles POST requests to `/tasks`, creating and saving a new task entity using data from the request body. |
| [NotificationClient.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/NotificationClient.java) | Define a Feign client interface for sending notifications to the service-notification service via POST to `/notification`. |
| [HelloWordController.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/HelloWordController.java) | Expose a REST API endpoint to retrieve a customizable message. |
| [TaskNotificationSchedule.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/TaskNotificationSchedule.java) | Schedule task notifications for due tasks in the service architecture. |
| [TasksRepository.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/TasksRepository.java) | Define a repository interface for managing tasks with deadlines. Retrieves tasks due within a specified deadline, filtering out those already notified. |
| [TaskRequest.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/TaskRequest.java) | Define a data structure for Task requests with title, email, due date, and notification status. |
| [NotificationRequest.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/NotificationRequest.java) | Define a data structure for handling notification requests with message and email fields. |
| [Application.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.task/src/main/java/com/raphaelrychard/service/tasks/Application.java) | Initialize Spring Boot application with Feign clients and scheduling capabilities. |

</details>

<details>
<summary><b>service.notification</b></summary>

| File | Summary |
| :--- | :--- |
| [pom.xml](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/pom.xml) | Define the project's build configuration and dependencies for the service.notification module. Manages Spring Boot and Spring Cloud dependencies, including web, Eureka client, and Feign. |
| [mvnw.cmd](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/mvnw.cmd) | Generate Apache Maven Wrapper script to download and install Maven distributions. |
| [mvnw](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/mvnw) | Initiate Apache Maven Wrapper setup and download Apache Maven distribution based on specified properties. |
| [Dockerfile](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/Dockerfile) | Create a Docker image for the notification service. Exposes the service on port 8082. |
| [NotificationController.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/src/main/java/com/raphaelrychard/services/notification/NotificationController.java) | Define a RESTful endpoint to send notifications. Handles POST requests to `/notification`, logs the notification content, and responds with a success status. |
| [NotificationRequest.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/src/main/java/com/raphaelrychard/services/notification/NotificationRequest.java) | Define a data structure for handling notification requests within the service architecture. |
| [Application.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/src/main/java/com/raphaelrychard/services/notification/Application.java) | Initialize the Spring Boot application for the notification service. |
| [ApplicationTests.java](https://github.com/raphaelrychard/spring-cloud-microservices-lab/blob/master/service.notification/src/test/java/com/raphaelrychard/services/notification/ApplicationTests.java) | Test the application context loading in the notification service module. |

</details>

</details>

---

## Getting Started

### Prerequisites

This project requires the following dependencies:

- **Programming Language:** Java
- **Package Manager:** Maven
- **Container Runtime:** Docker

### Installation

Build `spring-cloud-microservices-lab` from the source and install dependencies:

1. **Clone the repository:**

```sh
git clone https://github.com/raphaelrychard/spring-cloud-microservices-lab
```

2. **Navigate to the project directory:**

```sh
cd spring-cloud-microservices-lab
```

3. **Install the dependencies:**

Using [Docker](https://www.docker.com/):

```sh
docker build -t raphaelrychard/spring-cloud-microservices-lab .
```

Using [Maven](https://maven.apache.org/):

```sh
mvn install
```

### Usage

Run the project with:

Using [Docker](https://www.docker.com/):

```sh
docker run -it {image_name}
```

Using [Maven](https://maven.apache.org/):

```sh
mvn exec:java
```

### Testing

Run the test suite with:

Using [Maven](https://maven.apache.org/):

```sh
mvn test
```
