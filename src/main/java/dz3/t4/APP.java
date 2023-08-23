package dz3.t4;

public class APP {
    public static void main(String[] args) {
        User user = new User();
        Admin admin = new Admin();

        NotificationSystem chat = new NotificationSystem();
        chat.addObserver(admin);
        chat.addObserver(user);

        chat.addMessage("Hi");
        chat.addMessage("Hello");
        chat.addMessage("Buy");

        chat.removeObserver(user);
        chat.addMessage("Buy-buy");
    }
}

