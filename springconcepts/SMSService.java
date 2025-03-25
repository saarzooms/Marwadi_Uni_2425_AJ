public class SMSService implements MessagingService {

    @Override
    public void sendMessage(String receiver, String msg) {
        System.out.println("Send sms to " + receiver + " with msg" + msg);
    }

}
