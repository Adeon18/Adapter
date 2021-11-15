package sender;

import interfaces.User;

public class MessageSender {
    public boolean send(String text, User user, String country){
        if (user.getUserCountry().equals(country)){
            System.out.println("The message ' " + text + "' was sent to the given user.");
            return true;
        }
        return false;
    }
}
