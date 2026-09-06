# TOOL_STRATEGY.md


# Feature Usage Log


## 1. Copilot Inline Completion


Purpose:


Generate initial Project model.


Why This Feature:


Fast generation of boilerplate code.


Outcome:


Produced contractor-style starter model.


---


## 2. Copilot Inline Completion


Purpose:


Generate Project Service.


Why This Feature:


Quick service scaffolding.


Outcome:


Produced initial AI-generated implementation for review.


---


## 3. Copilot Chat


Purpose:


Code Review.


Why This Feature:


Allowed analysis of architecture and security issues.


Outcome:


Identified missing validation, authorization and tenant isolation.


---


## 4. Copilot Chat


Purpose:


Architecture Generation.


Why This Feature:


Created layered architecture recommendations.


Outcome:


Controller-Service-Repository pattern adopted.


---


## 5. Copilot Chat


Purpose:


Test Generation.


Why This Feature:


Quickly generated test scenarios and validation paths.


Outcome:


Produced initial unit test coverage.


---


## 6. Copilot Chat


Purpose:


Documentation Support.


Why This Feature:


Assisted in drafting specifications and impact analysis.


Outcome:


Reduced documentation creation effort.


---


# Scenario Responses


## Understanding a complex 600-line legacy service before wiring a new service


Feature:


Copilot Chat


Reason:


Copilot Chat can summarize large code sections and explain relationships between methods, making legacy code easier to understand before integration.


---


## Generating consistent request-validation middleware across multiple handlers


Feature:


Copilot Chat


Reason:


A single prompt can generate consistent validation patterns and reduce duplication.


---


## Verifying JWT verification logic


Feature:


Copilot Chat


Reason:


Copilot can review authentication code and highlight potential weaknesses involving expiry handling and signature validation.


---


## Enforcing linting and testing before commits


Feature:


GitHub Actions generated with Copilot


Reason:


Copilot can assist in creating CI workflows that automatically run tests and validation.


---


## Reviewing contractor AI-generated code for vulnerabilities


Feature:


Copilot Chat


Reason:


Copilot can identify common weaknesses, code smells and security risks before deployment.


---


## Enforcing multi-tenant data isolation across developers


Feature:


copilot-instructions.md


Reason:


Project-wide instructions provide consistent guidance to all developers using Copilot.


---


# Limitations Encountered


## Limitation 1


Prompt:


Generate Project Service.


Issue:


Authorization logic was omitted.


Detection:


Manual review.


Resolution:


Added organization-level access restrictions.


---


## Limitation 2


Prompt:


Generate Audit Model.


Issue:


Generated model allowed mutable fields.


Detection:


Review against compliance requirements.


Resolution:


Redesigned model as immutable.


---


## Limitation 3


Prompt:


Generate Notification Service.


Issue:


Did not explicitly prevent cross-tenant access.


Detection:


Security review.


Resolution:


Added tenant isolation requirements and validation.