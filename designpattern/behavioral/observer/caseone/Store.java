package designpattern.behavioral.observer.caseone;

public class Store {
    private final NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotion(){
        notificationService.notifySubs();
    }

    public NotificationService getServic(){
        return notificationService;
    }

}
