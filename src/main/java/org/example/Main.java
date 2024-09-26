package org.example;


import org.example.model.Card;
import org.example.model.CardsDeck;

public class Main {
        public static void main(String[] args) {
            CardsDeck cardsDeck = new CardsDeck();
            Card card = cardsDeck.getCardFromDeck();
            System.out.println(card);
        }

}