import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Represents a Tutorial that displays text with a delay between characters.
 */
public class Tutorial {
    private static final String FILE_PATH = "Tutorial.txt";
    private static final int DELAY = 20; // Delay between characters in milliseconds

    /**
     * Starts the tutorial by reading the text from a file and displaying it with a delay.
     */
    public void startTutorial() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                displayTextWithDelay(line, DELAY);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    /**
     * Displays the given text with a delay between characters.
     *
     * @param text  the text to display
     * @param delay the delay between characters in milliseconds
     */
    private void displayTextWithDelay(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}