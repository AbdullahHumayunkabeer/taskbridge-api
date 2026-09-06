# TaskBridge Notification & Audit Service
 
## Technology Stack
 
- Java 8
- Maven 3.9
- JUnit 5
- GitHub Copilot
- Layered Architecture
 
## Services
 
### Project Service
 
Responsible for:
 
- Create Project
- Update Project Status
- Get Projects By Team
- Delete Project
 
### Notification Service
 
Responsible for:
 
- Generate user notifications
- Mark notifications as read
 
### Audit Service
 
Responsible for:
 
- Audit logging
- Audit history retrieval
- Immutable audit records
 
## Running Tests
 
```bash
mvn test