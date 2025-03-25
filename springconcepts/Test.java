public class Test {
    public static void main(String[] args) {
        DIController dieController = new DIController();
        MessagingService serviceEmail = dieController.getMessagingService("email");
        NotificationService eService = new NotificationService(serviceEmail);
        eService.sendNotification("Arzoo", "My first email");
        MessagingService serviceSMS = dieController.getMessagingService("sms");
        NotificationService sService = new NotificationService(serviceSMS);
        sService.sendNotification("Arzoo", "My first sms");
    }
}
