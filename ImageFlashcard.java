public class ImageFlashcard extends Flashcard {
    private String imagePath;

    public ImageFlashcard(int id, String question, String answer, String imagePath) {
        super(id, question, answer);
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
