package twitter;

import facebook.FacebookUser;
import facebook.MyFacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    TwitterUser twitterUser;
    MyTwitterUser twitterUserAdapter;

    @BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("lol@gmail.com", "Germany", new Date());
        twitterUserAdapter = new MyTwitterUser(twitterUser);
    }

    @Test
    void getUserEmail() {
        assertEquals(twitterUserAdapter.getUserEmail(), twitterUser.getGetUserMail());
    }

    @Test
    void getUserCountry() {
        assertEquals(twitterUserAdapter.getUserCountry(), twitterUser.getGetCountry());
    }

    @Test
    void getLastActivity() {
        assertEquals(twitterUserAdapter.getLastActivity(), twitterUser.getGetLastActiveTime());
    }
}