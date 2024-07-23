import java.util.*;

class Card {

    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit geSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return rank + "of" + suit;
    }
}

class Deck {
    List<Card> cards;
    Random random = new Random();

    Deck() {
        initializeDeck();
    }

    void initializeDeck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    void shuffleDeck() {
        Collections.shuffle(cards, random);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new NoSuchElementException("No cards left");
        }
        return cards.remove(cards.size() - 1);
    }

    void addCard(Card card) {
        cards.add(card);
    }

    int getDeckSize() {
        return cards.size();
    }
}

public class cardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Initial deck size: " + deck.getDeckSize());
        Card drawnCard = deck.drawCard();
        System.out.println("Drawn card: " + drawnCard);
        System.out.println("Deck size after drawing a card: " + deck.getDeckSize());
        deck.addCard(drawnCard);
        System.out.println("Deck size after adding a card back: " + deck.getDeckSize()); // Should print: 52
        deck.shuffleDeck();
        System.out.println("Deck shuffled.");
        Card drawnCard1 = deck.drawCard();
        System.out.println("Drawn card: " + drawnCard1);
    }
}
