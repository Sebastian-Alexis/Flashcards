import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Flashcard> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Flashcard card) {
        this.cards.add(card);
    }

    public void removeCard(Flashcard card) {
        this.cards.remove(card);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public ArrayList<Flashcard> getCards() {
        return cards;
    }
}
