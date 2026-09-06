package notifications;

import java.util.ArrayList;

import java.util.List;
import Notifications.Notification;

public class NotificationService {


    private final List<Notification>

            notifications =

            new ArrayList<>();


    public void createNotification(

            Notification notification) {


        notifications.add(notification);

    }


    public List<Notification>

    getUnreadNotifications(

            Long userId) {


        return notifications;

    }


    public void markAsRead(Long id) {


    }

}
