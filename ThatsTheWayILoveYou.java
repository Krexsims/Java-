import javax.swing.*;
import java.awt.*;

public class ThatsTheWayILoveYou extends JFrame {
    private JLabel lyricsLabel;

    // Lyrics list
    private String[] lyrics = {
        "Screaming and fighting",
        "And kissing in the rain",
        "And it's 2 a.m.",
        "And I'm cursing your name",
        "So in love that you act insane",
        "And that's the way I love you"
    };

    // You can adjust these
    private int charDelay = 70;  // milliseconds between each character
    private int lineDelay = 900; // milliseconds between lines

    public ThatsTheWayILoveYou() {
        // Window setup
        setTitle("ThatsTheWayILoveYou Lyrics");
        setSize(700, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label setup
        lyricsLabel = new JLabel("", SwingConstants.CENTER);
        lyricsLabel.setFont(new Font("Serif", Font.PLAIN, 22));
        add(lyricsLabel, BorderLayout.CENTER);

        // Center window
        setLocationRelativeTo(null);
        setVisible(true);

        // Show lyrics
        displayLyrics();
    }

    private void displayLyrics() {
        new Thread(() -> {
            try {
                for (String line : lyrics) {
                    // Typing effect for each line
                    StringBuilder text = new StringBuilder();
                    for (char c : line.toCharArray()) {
                        text.append(c);
                        lyricsLabel.setText(text.toString());
                        Thread.sleep(charDelay); // delay between characters
                    }
                    Thread.sleep(lineDelay); // pause before next line
                }

                // Optional ending line
                lyricsLabel.setText("and that's the way i love you ❤️");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ThatsTheWayILoveYou());
    }
}


