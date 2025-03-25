class EmailService implements MessagingService {

    @Override
    public void sendMessage(String receiver, String msg) {
        System.out.println("Send email to " + receiver + " with msg" + msg);
    }

}