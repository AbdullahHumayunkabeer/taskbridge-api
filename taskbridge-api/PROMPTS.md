# PROMPTS.md


## Introduction


GitHub Copilot was used throughout development

for code generation, documentation drafting,

review assistance and test generation.


---


# Prompt 1


Prompt:


Generate a Project model and a Project service with create, update status, get by team, and delete functions. Use a database.


Feature Used:


GitHub Copilot Inline Completion


Technique:


Zero-Shot Prompting


Purpose:


Generate inherited contractor code as required by the assessment.


---


# Prompt 2


Prompt:


Review this Project Service for architecture, security, validation and multi-tenant issues.


Feature Used:


GitHub Copilot Chat


Technique:


Constraint Prompting


Purpose:


Identify risks and remediation opportunities.


---


# Prompt 3


Prompt:


Generate a production-quality Project Service using controller, service and repository layers.


Feature Used:


GitHub Copilot Chat


Technique:


Specificity Prompting


Purpose:


Create remediated project service architecture.


---


# Prompt 4


Prompt:


Create immutable AuditEntry model and Audit Service for project milestone events.


Feature Used:


GitHub Copilot Chat


Technique:


Role-Based Prompting


Purpose:


Generate audit functionality using compliance-focused design.


---


# Prompt 5


Prompt:


Generate Notification Service supporting unread notifications and mark-as-read operations.


Feature Used:


GitHub Copilot Chat


Technique:


Specificity Prompting


Purpose:


Create notification workflow.


---


# Prompt 6


Prompt:


Generate JUnit tests covering audit creation, immutability, filtering and authorization scenarios.


Feature Used:


GitHub Copilot Chat


Technique:


Iterative Refinement


Purpose:


Create required test coverage.


---


# Prompting Techniques Demonstrated


- Zero-Shot Prompting

- Constraint Prompting

- Specificity Prompting

- Role-Based Prompting

- Iterative Refinement


---


# Post-Generation Corrections


## Correction 1


Issue:


Generated Project Service lacked authorization logic.


Fix:


Added organization-level access restrictions.


---


## Correction 2


Issue:


Generated service lacked tenant isolation.


Fix:


Added organizationId filtering requirements.


---


## Correction 3


Issue:


Audit records could potentially be modified.


Fix:


Audit model redesigned as immutable.


---


## Correction 4


Issue:


Missing validation and structured logging.


Fix:


Added validation requirements and logging standards.


---


## Correction 5


Issue:


Insufficient security considerations around audit history access.


Fix:


Added authorization and access controls.