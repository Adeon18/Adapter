package facebook;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    FacebookUser facebookUser;
    MyFacebookUser facebookUserAdapter;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("lol@gmail.com", "Ukraine", new Date());
        facebookUserAdapter = new MyFacebookUser(facebookUser);
    }

    @org.junit.jupiter.api.Test
    void getUserEmail() {
        assertEquals(facebookUserAdapter.getUserEmail(), facebookUser.getGetEmail());
    }

    @org.junit.jupiter.api.Test
    void getUserCountry() {
        assertEquals(facebookUserAdapter.getUserCountry(), facebookUser.getGetUserCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActivity() {
        assertEquals(facebookUserAdapter.getLastActivity(), facebookUser.getGetUserActiveTime());
    }
}