package com.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyNewStackTest {
    MyNewStack myNewStack;

    @BeforeEach
    void startWithThis(){
        myNewStack = new MyNewStack(5);

    }

    @Test
    void pushOneElementTest(){
        myNewStack.push(5);
        assertEquals(5, myNewStack.peek());
    }

    @Test
    void pushTwoElementTest(){
        myNewStack.push(8);
        myNewStack.push(6);
        assertEquals(6, myNewStack.peek());
    }

    @Test
    void pushTwoElement_popOne_popOneTest(){
        myNewStack.push(4);
        myNewStack.push(11);

        assertEquals(11, myNewStack.removeLastElement());
        assertEquals(4, myNewStack.peek());
    }

    @Test
    void pushTwo_popTwo_shouldBeEmpty(){
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.removeLastElement();
        myNewStack.removeLastElement();
        assertTrue(myNewStack.isEmpty());
    }

    @Test
    void pushThree_shouldBeFullTest(){
        myNewStack = new MyNewStack(3);
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.push(15);
        assertTrue(myNewStack.isFull());
    }

    @Test
    void pushOneElementAfterStackIsFull_throwsStackOverflowException(){
        myNewStack = new MyNewStack(3);
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.push(15);
        assertTrue(myNewStack.isFull());

        assertThrows(MyNewStack.StackOverflowException.class, ()-> myNewStack.push(5));
    }

    @Test
    void removeLastElement_whenStackIsEmpty(){
        assertTrue(myNewStack.isEmpty());
        assertThrows(MyNewStack.StackUnderflowException.class, ()-> myNewStack.removeLastElement());
    }

    @Test
    void peekEmptyStack_throwsStackUnderFlowException(){
        assertTrue(myNewStack.isEmpty());
        assertThrows(MyNewStack.StackUnderflowException.class, ()-> myNewStack.peek());
    }

}