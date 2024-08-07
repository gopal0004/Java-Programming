package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// 1) Write a program to store a deck of 52 cards in a linked list in random sequence using a Random class
// object. You can represent a card as a two-character string—”1C” for the ace of clubs, “JD” for the
// jack of diamonds, and so on. Output the cards from the linked list as four hands of 13 cards.

public class Q4 {
    public static void main(String[] args) {
        
        Random r =new Random();
        List<String> deck = new LinkedList<>();

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

        for(int i=0;i<13;i++){
            hand1.add(deck.removeFirst());
            hand2.add(deck.removeFirst());
            hand4.add(deck.removeFirst());
            hand3.add(deck.removeFirst());
        }

        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);

    }
}