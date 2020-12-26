package com.timbuchalka;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanCorrectlyReverseAnyGivenNumber(){
        ReverseNumbers newReverse = new ReverseNumbers();
        int result = newReverse.methodReverse(12567);
        assertEquals(76521, result);
    }
}