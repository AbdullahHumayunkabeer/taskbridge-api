package notifications;
import java.util.ArrayList;

import java.util.List;


public class AuditService {


    private final List<AuditEntry> auditEntries =

            new ArrayList<>();


    public void createAuditEntry(

            AuditEntry auditEntry) {


        auditEntries.add(auditEntry);

    }


    public List<AuditEntry> getAuditHistory(

            Long projectId) {


        return auditEntries;

    }

}
 