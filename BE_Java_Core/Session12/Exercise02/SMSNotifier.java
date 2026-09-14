package vn.edu.rikkei.session12.ex02;

public class SMSNotifier implements INotifier {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.printf("| %-47s |\n", "[SMS to " + recipient + "]");

        String content = "-> Message: " + message;
        if (content.length() > 47) {
            content = content.substring(0, 44) + "...";
        }

        System.out.printf("| %-47s |\n", content);
    }
}
