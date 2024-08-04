public class AudioFlashcard extends Flashcard {
    private String audioPath;

    public AudioFlashcard(int id, String question, String answer, String audioPath) {
        super(id, question, answer);
        this.audioPath = audioPath;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }
}
