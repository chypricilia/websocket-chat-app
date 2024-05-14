# WebSocket Chat Application with Spring Boot

This project is a demonstration of a WebSocket chat application built using Spring Boot, with SockJS fallback and the STOMP protocol. It provides a real-time chat interface where users can send and receive messages instantly.

## Features

- **WebSocket Communication:** Utilizes WebSockets for real-time bidirectional communication.
- **SockJS Fallback:** Ensures compatibility with browsers that do not support WebSockets by falling back to SockJS.
- **STOMP Protocol:** Uses the Simple (or Streaming) Text Oriented Messaging Protocol (STOMP) for messaging.
- **Spring Boot Integration:** Leverages Spring Boot to simplify the setup and configuration.
- **Frontend:** A simple frontend to demonstrate the chat functionality, which can be enhanced or replaced with a more sophisticated UI.

## Requirements

1. **Java 17:** The application requires Java Development Kit (JDK) version 17.
2. **Maven 3.x.x:** Maven is used for building and managing the project dependencies.

## Prerequisites

- **Java 17:** Ensure that Java 17 is installed. You can download it from [Oracle's official site](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
- **Maven 3.x.x:** Ensure that Maven is installed. You can download it from [Apache Maven's official site](https://maven.apache.org/download.cgi).
- **Environment Variables:** Set up your `JAVA_HOME` to point to the JDK installation directory and `M2_HOME` to the Maven installation directory. Add `JAVA_HOME/bin` and `M2_HOME/bin` to your system's `PATH`.

## Steps to Setup

**1. Clone the application**

Open a terminal and run the following command to clone the repository:

```bash
git clone https://github.com/chypricilia/websocket-chat-app.git
cd websocket-chat-app
```

**2. Build and run the app using Maven**

To build and run the application, execute the following command:

```bash
mvn spring-boot:run
```

This will download all necessary dependencies, compile the project, and start the Spring Boot application.

**3. Access the chat application**

Once the application is running, open a web browser and navigate to:

```
http://localhost:8082
```

You should see the chat interface where you can start sending and receiving messages.

## Project Structure

- **src/main/java:** Contains the Java source code, including configuration, controllers, and WebSocket handlers.
- **src/main/resources:** Contains the application configuration files and static resources.
- **pom.xml:** Maven configuration file that lists dependencies and build instructions.

## Configuration

- **WebSocket Configuration:** Configures WebSocket endpoints and STOMP messaging.
- **Application Properties:** Located in `src/main/resources/application.properties`, this file contains configuration settings for the Spring Boot application.

## Usage

1. Open the chat application in multiple browser tabs or windows.
2. Enter a username when prompted.
3. Start sending messages. Messages should appear in real-time across all open instances of the application.

## Customization

You can customize the chat application by modifying the frontend or enhancing backend functionality. For example:

- **Frontend:** Replace the simple HTML/JavaScript frontend with a more sophisticated framework like React or Angular.
- **Backend:** Add features such as user authentication, message persistence, or more complex messaging protocols.

## Troubleshooting

- **Port Conflicts:** If the default port 8080 is in use, you can change it by modifying `src/main/resources/application.properties` and adding `server.port=<new_port_number>`.
- **Dependency Issues:** Ensure that you have the correct versions of Java and Maven installed. Run `mvn clean install` to resolve any dependency issues.
