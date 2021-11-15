package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAuthTest {

    Авторизація prev_auth;
    UserAuth fixed_auth;
    DataBase db;

    @BeforeEach
    void setUp() {
        prev_auth = new Авторизація();
        fixed_auth = new UserAuth();
        db = new DataBase();
    }

    @Test
    void authorise() {
        assertEquals(fixed_auth.authorise(db), prev_auth.авторизуватися(db));
    }
}