# ARCHITECTURE.md


The solution consists of two logical services:


1. Project Service

2. Notification & Audit Service


The Project Service is responsible for project lifecycle management including project creation, status updates, retrieval and deletion.


The Notification & Audit Service is responsible for generating user notifications and maintaining an immutable audit history of all project milestone events.


Data flow follows a layered architecture:


Client Request

→ Controller

→ Service

→ Repository

→ Persistence Layer


When a project milestone changes, the Project Service triggers the Notification & Audit Service.


The Audit Service creates an immutable audit entry containing event metadata, actor information and before/after state snapshots.


The Notification Service generates notifications for all relevant project team members.


Multi-tenant isolation is enforced through organizationId ownership checks, ensuring users only access data belonging to their organisation.


The layered architecture improves maintainability, testability and separation of concerns.


A synchronous integration approach was selected for simplicity and faster implementation. The primary trade-off is reduced scalability compared to an event-driven architecture. Future versions can introduce asynchronous messaging without significant architectural changes.