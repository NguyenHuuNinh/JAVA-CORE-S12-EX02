package vn.edu.rikkei.session12.ex02;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- GỬI THÔNG BÁO KHUYẾN MÃI CRM ---");
        String message = "Giảm 30% toàn bộ khóa học Java Core trong hôm nay!";
        System.out.println("Nội dung: \"" + message + "\"\n");

        INotifier[] notifiers = {
                new EmailNotifier(),
                new SMSNotifier()
        };

        String[] recipients = {
                "an.nguyen@rikkei.edu.vn",
                "0987654321"
        };

        System.out.println("+-------------------------------------------------+");
        System.out.println("|            HỆ THỐNG GỬI TIN NHẮN CRM RIKKEI     |");
        System.out.println("+-------------------------------------------------+");

        for (int i = 0; i < notifiers.length; i++) {
            notifiers[i].sendNotification(recipients[i], message);

            if (i < notifiers.length - 1) {
                System.out.println("|-------------------------------------------------|");
            }
        }

        System.out.println("+-------------------------------------------------+");
    }
}
