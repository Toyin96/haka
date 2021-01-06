package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StrictlyIdenticalArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanInitializesAnArray(){
        StrictlyIdenticalArrays checkArray = new StrictlyIdenticalArrays();
        checkArray.initializeFirstArrayWith("23 45 21 46");
        assertNotNull(checkArray.list1);
        assertEquals(checkArray.list1[0], 23);
        Arrays.stream(checkArray.list1).forEach(element-> System.out.print(element+ " "));
        System.out.println(Arrays.toString(checkArray.list1));
    }

    @Test
    void checkThatMethodCanInitializeAnArray(){
        StrictlyIdenticalArrays checkArray = new StrictlyIdenticalArrays();
        int[] result = checkArray.initializeSecondArrayWith("23 45 21 46");
        assertNotNull(result);
    }

    @Test
    void checkThatMethodCanCheckIfTwoArraysAreIdenticalOrNot(){
        StrictlyIdenticalArrays checkArray = new StrictlyIdenticalArrays();
        int[] answer1 = checkArray.initializeFirstArrayWith("23 45 21 46");
        int[] result = checkArray.initializeSecondArrayWith("23 45 21 46");
        boolean answer = checkArray.compareArray(answer1, result);
        assertTrue(answer);
    }

    @Test
    void checkThatMethodCanCollectInput(){
        StrictlyIdenticalArrays checkArray = new StrictlyIdenticalArrays();
       String answer= checkArray.collectInput();
        assertNotNull(answer);
    }
}