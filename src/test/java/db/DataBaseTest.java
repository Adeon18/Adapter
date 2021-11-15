package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    БазаДаних prev_db;
    DataBase fixed_db;

    @BeforeEach
    void setUp() {
        prev_db = new БазаДаних();
        fixed_db = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals(fixed_db.getUserData(), prev_db.отриматиДаніКористувача());
    }

    @Test
    void getStatisticalData() {
        assertEquals(fixed_db.getStatisticalData(), prev_db.отриматиСтатистичніДані());
    }
}