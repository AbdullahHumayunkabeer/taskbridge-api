package notifications;
import java.util.Date;


public class Notification {


    private Long id;

    private Long recipientUserId;

    private Long projectId;

    private String eventType;

    private String message;

    private boolean read;

    private Date createdAt;

}