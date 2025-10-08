import java.util.concurrent.TimeUnit;

public class LineWithoutAHook {
    public static void main(String[] args) {
        String[] lines = {
            "'Cause there is something and there is nothing",
            "There is nothing in between",
            "And in my eyes, there is a tiny dancer watching over me",
            "He's singing, She's a, she's a lady, and I am just a boy",
            "He's singing, She's a, she's a lady, and I am just a line without a—",
            "Oh, baby, I am a wreck when I'm without you",
            "I need you here to stay",
            "Broke all my bones that day I found you",
            "Crying at the lake",
            "Oh, was it something I said to make you feel like you're a burden?",
            "Oh, and if I could take it all back",
            "I swear that I would pull you from the tide"
        };

        // Optional timing adjustments
        double[] charDelays = {0.065, 0.060, 0.070, 0.068, 0.075, 0.068, 0.060, 0.070, 0.060, 0.072, 0.065, 0.078};
        double[] lineDelays = {1.2, 0.8, 1.4, 1.5, 1.6, 1.3, 0.9, 1.2, 0.8, 1.5, 1.2, 2.0};

        for (int i = 0; i < lines.length; i++) {
            printWithDelay(lines[i], charDelays[i]);
            try {
                TimeUnit.SECONDS.sleep((long) lineDelays[i]);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println();
        }
    }

    private static void printWithDelay(String line, double charDelay) {
        for (char c : line.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            try {
                TimeUnit.MILLISECONDS.sleep((long) (charDelay * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
