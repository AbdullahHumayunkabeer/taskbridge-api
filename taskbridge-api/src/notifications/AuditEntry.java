package notifications;

import java.util.Date;


public class AuditEntry {


    private Long id;


    private Long projectId;


    private String eventType;


    private String entityType;


    private String entityId;


    private String actorUserId;


    private String organizationId;


    private String previousState;


    private String newState;


    private Date timestamp;

}