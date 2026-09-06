```markdown
 # GitHub Copilot Project Instructions 
 ## Technology 
 - Java 8 
 - Maven 
 - JUnit 5 
  
  ## Architecture 
  Controller → Service → Repository → Model 
  
  ## Coding Standards 
  - Use meaningful names 
  - Keep methods small 
  - Use JavaDocs on public methods 
  - Handle exceptions explicitly 

  ## Security 
  - Multi-tenant isolation using organizationId 
  - No hardcoded credentials 
  - Validate all input 
  - Restrict access across organizations 
  
  ## Audit Requirements 
  - Audit entries are immutable 
  - No update operation 
  - No delete operation 
  
  ## Testing 
  - Unit tests required 
  - Security scenarios must be tested