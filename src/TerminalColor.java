/**
 * Utility class for formatting text with ANSI escape codes for terminal colors.
 */
public class TerminalColor {
    // ANSI escape codes for text colors
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";
    private static final String ORANGE = "\u001B[38;5;208m";

    /**
     * Formats the text with red color.
     *
     * @param text the text to format
     * @return the formatted text
     */
    public static String formatRed(String text) {
        return RED + text + RESET;
    }

    /**
     * Formats the text with green color.
     *
     * @param text the text to format
     * @return the formatted text
     */
    public static String formatGreen(String text) {
        return GREEN + text + RESET;
    }

    /**
     * Formats the text with blue color.
     *
     * @param text the text to format
     * @return the formatted text
     */
    public static String formatBlue(String text) {
        return BLUE + text + RESET;
    }

    /**
     * Formats the text with orange color.
     *
     * @param text the text to format
     * @return the formatted text
     */
    public static String formatOrange(String text) {
        return ORANGE + text + RESET;
    }

    /**
     * Formats the text with purple color.
     *
     * @param text the text to format
     * @return the formatted text
     */
    public static String formatPurple(String text) {
        return PURPLE + text + RESET;
    }

    /**
     * Formats the text with yellow color.
     *
     * @param text the text to format
     * @return the formatted text
     */
    public static String formatYellow(String text) {
        return YELLOW + text + RESET;
    }
}