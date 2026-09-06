# IMPACT_ANALYSIS.md


## Change Request


The Product Team requested the following changes:


1. Add a new milestone event type:

   MILESTONE_REOPENED


2. Audit entries must capture:

   Actor IP Address


---


# Impact Assessment


## Data Model Changes


### AuditEntry.java


Changes:


- Add actorIpAddress field

- Update constructors

- Update validation logic


Impact Type:


Additive


Migration Required:


Yes


---


### Notification.java


Changes:


- Support new event type:

  MILESTONE_REOPENED


Impact Type:


Additive


Migration Required:


No


---


# Service Layer Changes


## AuditService.java


Changes:


- Persist actor IP address

- Handle MILESTONE_REOPENED events


Impact Type:


Additive


---


## NotificationService.java


Changes:


- Generate notifications for MILESTONE_REOPENED


Impact Type:


Additive


---


## ProjectServiceV2.java


Changes:


- Trigger new reopened event

- Pass actor IP address to Audit Service


Impact Type:


Additive


---


# Controller Changes


## AuditController.java


Changes:


- Accept actor IP address in requests


Impact Type:


Additive


---


## NotificationController.java


Changes:


- No functional API changes


Impact Type:


None


---


# Test Impact


New tests required:


1. Audit entry contains actor IP address.


2. Notification sent for reopened milestone.


3. Audit history returns reopened events correctly.


---


# Security and Compliance Risks


Actor IP addresses may be considered personal information.


Potential Risks:


- Privacy concerns

- Exposure through application logs

- Long-term retention risks

- Unauthorized access to audit history


Mitigation Recommendations:


- Store only where necessary

- Restrict audit access

- Define retention policy

- Encrypt sensitive audit data

- Avoid exposing IP addresses in notification responses


---


# Recommended Implementation Sequence


1. Update AuditEntry model.

2. Add database migration.

3. Update Project Service.

4. Update Audit Service.

5. Update Notification Service.

6. Add tests.

7. Update documentation.


---


# How Copilot Assisted This Analysis


Copilot was used to identify potentially impacted models,

services and controllers.


Human review was required to validate:


- Privacy concerns

- Compliance implications

- Migration requirements

- Tenant isolation impacts


Several Copilot recommendations were refined to align

with multi-tenant SaaS security requirements.