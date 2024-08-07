package Assign1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// 1) Write a program to store a deck of 52 cards in a linked list in random sequence using a Random class
// object. You can represent a card as a two-character string—”1C” for the ace of clubs, “JD” for the
// jack of diamonds, and so on. Output the cards from the linked list as four hands of 13 cards.

public class CF4 {
    public static void main(String[] args) {
        LinkedList<String> deck = new LinkedList<>();
        Random r =new Random();
        for(int i=1;i<=13;i++){
            deck.add(i + "C");
            deck.add(i + "S");
            deck.add(i + "H");
            deck.add(i + "S");
        }

        Collections.shuffle(deck,r);

        List<String> hand1 = new ArrayList<>();
        List<String> hand2 = new ArrayList<>();
        List<String> hand3 = new ArrayList<>();
        List<String> hand4 = new ArrayList<>();

        for(int i=1;i<=13;i++){
            hand1.add(deck.removeFirst());
            hand2.add(deck.removeFirst());
            hand3.add(deck.removeFirst());
            hand4.add(deck.removeFirst());
        }

        System.out.println("Hand1 : " + hand1);
        System.out.println("Hand2 : " + hand2);
        System.out.println("Hand3 : " + hand3);
        System.out.println("Hand4 : " + hand4);
    }
}
