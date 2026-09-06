package notifications;
import notifications.AuditService;

public class AuditController {


    private AuditService service;


    public void createAudit(AuditEntry entry) {

        service.createAuditEntry(entry);

    }


    public void getAuditHistory(Long projectId) {

        service.getAuditHistory(projectId);

    }

}
