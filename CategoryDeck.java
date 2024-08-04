public class CategoryDeck {
    private Flashcard[][] categorizedCards;

    public CategoryDeck(int categories, int difficulties) {
        this.categorizedCards = new Flashcard[categories][difficulties];
    }

    public void addCard(int category, int difficulty, Flashcard card) {
        this.categorizedCards[category][difficulty] = card;
    }

    public Flashcard getCard(int category, int difficulty) {
        return this.categorizedCards[category][difficulty];
    }
}
