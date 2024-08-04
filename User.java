public class User {
    private String name;
    private Deck personalDeck;

    public User(String name) {
        this.name = name;
        this.personalDeck = new Deck();
    }

    public String getName() {
        return name;
    }

    public Deck getPersonalDeck() {
        return personalDeck;
    }

    public void addFlashcard(Flashcard card) {
        this.personalDeck.addCard(card);
    }

    public void removeFlashcard(Flashcard card) {
        this.personalDeck.removeCard(card);
    }
}
