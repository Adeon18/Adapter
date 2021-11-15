package twitter;

import interfaces.User;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser adaptee;

    public MyTwitterUser(TwitterUser adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getUserEmail() {
        return adaptee.getGetUserMail();
    }

    @Override
    public String getUserCountry() {
        return adaptee.getGetCountry();
    }

    @Override
    public Date getLastActivity() {
        return adaptee.getGetLastActiveTime();
    }
}
