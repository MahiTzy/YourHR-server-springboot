# YourHR — Spring Boot Backend

Backend service for the YourHR application, built with Spring Boot and configured with an H2 database for the documented development setup.

## Overview
This repository contains the server-side application. Review the controllers, services, entities, repositories, and security configuration for the exact HR workflows and API behavior.

## Related Project
- [YourHR React Frontend](https://github.com/MahiTzy/YourHR-UI-react)

## Technology
- Java
- Spring Boot
- H2 Database (as described by the project configuration)
- Build dependencies declared in the repository

## Getting Started
1. Install the JDK version required by the build file.
2. Clone the repository:
   ```bash
   git clone https://github.com/MahiTzy/YourHR-server-springboot.git
   cd YourHR-server-springboot
   ```
3. Review the application configuration and confirm the active database profile.
4. Run with the Maven wrapper if included (`./mvnw spring-boot:run`) or use the configured build tool.

## API Reference
Use controller mappings and DTOs as the source of truth for routes, methods, payloads, and authorization requirements.

## Configuration & Security
Keep secrets and environment-specific configuration outside source control. Use synthetic employee data for local testing.

## Testing
Run the tests using the build tool declared by the project.

## License
No license terms are specified here. Refer to the repository's LICENSE file, if present, before reuse.