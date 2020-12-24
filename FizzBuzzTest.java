package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanCorrectlyCalculateAFizzBBuzz(){
        String result = FizzBuzz.checkerMethod(4);
        System.out.println(result);
        assertEquals("4", result);
        assertEquals("FizzBuzz", FizzBuzz.checkerMethod(15));
        assertEquals("Buzz",FizzBuzz.checkerMethod(10));
    }
}