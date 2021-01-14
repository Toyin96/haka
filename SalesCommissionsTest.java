package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void salesCommissionTest(){
        int[] salesAmounts = {4000, 2500, 5000, 10000, 1000000};
        int[] frequency = new int[9];

        SalesCommissions.getSalesCommissionDistribution(salesAmounts, frequency);
        assertEquals(1, frequency[3]);
    }
}