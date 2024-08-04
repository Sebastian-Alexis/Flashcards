import java.util.ArrayList;
import java.util.Scanner;

public class FlashcardApp {
    private ArrayList<User> users;

    public FlashcardApp() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void startReviewSession(User user) {
        Deck deck = user.getPersonalDeck();
        for (Flashcard card : deck.getCards()) {
            System.out.println("Question: " + card.getQuestion());
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals(card.getAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + card.getAnswer());
            }
        }
    }

    public void adaptiveReview(Deck deck, int index) {
        if (index >= deck.getCards().size()) {
            return;
        }
        Flashcard card = deck.getCards().get(index);
        System.out.println("Question: " + card.getQuestion());
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals(card.getAnswer())) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + card.getAnswer());
        }
        adaptiveReview(deck, index + 1);
    }

    public static void main(String[] args) {
        FlashcardApp app = new FlashcardApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        User user = new User(name);
        app.addUser(user);

        while (true) {
            System.out.println("1. Add Flashcard");
            System.out.println("2. Start Review Session");
            System.out.println("3. Adaptive Review Session");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            if (choice == 1) {
                System.out.println("Enter question:");
                String question = scanner.nextLine();
                System.out.println("Enter answer:");
                String answer = scanner.nextLine();
                Flashcard card = new Flashcard(user.getPersonalDeck().getCards().size() + 1, question, answer);
                user.addFlashcard(card);
            } else if (choice == 2) {
                app.startReviewSession(user);
            } else if (choice == 3) {
                app.adaptiveReview(user.getPersonalDeck(), 0);
            } else if (choice == 4) {
                break;
            }
        }
    }
}
