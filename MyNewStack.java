package com.DataStructures;

public class MyNewStack {
    private final int[] elements;
    private int lastLocationWritten = -1;

    public MyNewStack(int numberOfElements){
        elements = new int[numberOfElements];

    }

    public void push(int elementToPush) throws StackOverflowException {
        try {
            elements[++lastLocationWritten] = elementToPush;
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            throw new StackOverflowException("Stack is full");
        }
    }

    public int peek() {
        if (isEmpty()){
            throw new StackUnderflowException("Stack is empty");
        }
        return elements[lastLocationWritten];
    }

    public int removeLastElement() {

        if (isEmpty()){
            throw new StackUnderflowException("Stack is empty");
        }
            int lastElement = elements[lastLocationWritten];
            elements[lastLocationWritten--] = 0;
            return lastElement;
    }

    public boolean isEmpty() {
        return (lastLocationWritten == -1);
    }

    public boolean isFull() {
        return (lastLocationWritten == (elements.length- 1));
    }

    public static class StackOverflowException extends RuntimeException {
        public StackOverflowException(String message) {
            super(message);
        }
    }

    public class StackUnderflowException extends RuntimeException{
        public StackUnderflowException(String message){
            super(message);
        }


    }
}