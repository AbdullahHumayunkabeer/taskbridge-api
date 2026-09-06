# Notification & Audit Service Specification


## Objective


Provide audit history and notification delivery for project milestone changes.


---


## Audit Model


Fields:


- id : Long

- projectId : Long

- eventType : String

- entityType : String

- entityId : String

- actorUserId : String

- organizationId : String

- previousState : String

- newState : String

- timestamp : Date


---


## Notification Model


Fields:


- id : Long

- recipientUserId : Long

- projectId : Long

- eventType : String

- message : String

- readStatus : Boolean

- createdAt : Date


---


## APIs


POST /audit


GET /audit/{projectId}


GET /notifications/{userId}


PATCH /notifications/{id}/read


---


## Validation Rules


- projectId required

- eventType required

- recipientUserId required


---


## Constraints


- Audit records immutable

- Organization level isolation enforced

- Authorized users only


---


## Copilot Assistance


Copilot assisted with API design and data model generation.


Human judgment was applied to security rules, tenant isolation and audit immutability requirements.

## Authorization Rules


Users may access data only for their own organisation.


Tenant isolation is enforced using organizationId.

 