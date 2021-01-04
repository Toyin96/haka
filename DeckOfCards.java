package com.timbuchalka;

public class DeckOfCards {

    public static void main(String[] args) {

        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        for (int a = 0; a < deck.length; a++){
            int j = (int) (Math.random() * (a + 1));
            int temp = deck[a];
            deck[a] = deck[j];
            deck[j] = temp;
        }

        String[] suits = {"Spades", "Hearts", "Diamond", "Clubs"};
        String[] rank = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};

        for (int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String ranks = rank[deck[i] / 13];

            System.out.println("Card Number " + deck[i] + ": " + ranks + " of " + suit);
        }
    }
}
