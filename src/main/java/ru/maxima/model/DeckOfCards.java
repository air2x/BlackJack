package ru.maxima.model;

import ru.maxima.model.enums.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    int sizeCards;

    private final List<NameOfCard> names = List.of(NameOfCard.TWO, NameOfCard.THREE, NameOfCard.FOUR, NameOfCard.FIVE,
            NameOfCard.SIX, NameOfCard.SEVEN, NameOfCard.EIGHT, NameOfCard.NINE, NameOfCard.TEN, NameOfCard.JACK,
            NameOfCard.QUEEN, NameOfCard.KING, NameOfCard.ACE);
    private final List<SuitOfCard> suits = List.of(SuitOfCard.CLUBS, SuitOfCard.DIAMONDS, SuitOfCard.HEARTS, SuitOfCard.SPADES);
    private List<Card> cards;

    public DeckOfCards() {
        createDeck();
        sizeCards = cards.size();
    }

    private void createDeck() {
        cards = new ArrayList<>();
        for (SuitOfCard suit : suits) {
            for (NameOfCard name : names) {
                cards.add(new Card(name, suit));
            }
        }
    }

    public Card getRandomCard() {
        Random random = new Random();
        return cards.get(random.nextInt(sizeCards));
    }
}
