package notifications;

public class NotificationController {


    private NotificationService service;


    public void getUnreadNotifications(Long userId) {

        service.getUnreadNotifications(userId);

    }


    public void markNotificationAsRead(Long id) {

        service.markAsRead(id);

    }

}