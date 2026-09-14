package vn.edu.rikkei.session12.ex02;

public class EmailNotifier implements INotifier {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.printf("| %-47s |\n", "[Email to " + recipient + "]");

        String content = "-> Title: CRM Notice -> Body: " + message;
        if (content.length() > 47) {
            content = content.substring(0, 44) + "...";
        }
        System.out.printf("| %-47s |\n", content);
    }
}
