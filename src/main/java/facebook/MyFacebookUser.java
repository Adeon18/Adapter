package facebook;

import interfaces.User;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser adaptee;

    @Override
    public String getUserEmail() {
        return adaptee.getGetEmail();
    }

    @Override
    public String getUserCountry() {
        return adaptee.getGetUserCountry();
    }

    @Override
    public Date getLastActivity() {
        return adaptee.getGetUserActiveTime();
    }
}
