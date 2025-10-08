import javax.swing.*;
import java.awt.*;

public class IsipLyrics extends JFrame {
    private JLabel lyricsLabel;

    // 🎵 Song Lyrics
    private String[] lyrics = {
        "Hindi ko maiwasan na isipin ka",
        "Tanong sa hangin kung ako ba'y naiisip mo?",
        "Litong-lito, litong-lito",
        "Sa'yo, sa'yo, sa'yo, sa'yo",
        "Sino ba naman ako para isipin mo?",
        "Hindi mo ba hinihintay ang mga tawag ko?",
        "Sa'yo, sa'yo, sa'yo, sa'yo'y",
        "Litong-lito, litong-lito"
    };

    // ⚙️ Timing (tuned for smooth feel)
    private int charDelay = 70;   // delay per character typing
    private int[] lineDelay = { 
        2700, 2800, 2400, 2400, 2700, 2900, 2620, 4100
    }; // delay after each full line before next starts

    public IsipLyrics() {
        // 🪟 Window setup
        setTitle("Healy After Dark - Isip (Lyrics)");
        setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 🎨 Label styling
        lyricsLabel = new JLabel("", SwingConstants.CENTER);
        lyricsLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        lyricsLabel.setForeground(new Color(255, 255, 255));
        lyricsLabel.setOpaque(true);
        lyricsLabel.setBackground(new Color(25, 25, 25)); // dark background
        add(lyricsLabel, BorderLayout.CENTER);

        // Center window
        setLocationRelativeTo(null);
        setVisible(true);

        // Start showing lyrics
        displayLyrics();
    }

    private void displayLyrics() {
        new Thread(() -> {
            try {
                for (int i = 0; i < lyrics.length; i++) {
                    StringBuilder text = new StringBuilder();

                    // Typing effect (char by char)
                    for (char c : lyrics[i].toCharArray()) {
                        text.append(c);
                        lyricsLabel.setText(text.toString());
                        Thread.sleep(charDelay);
                    }

                    // Pause after full line
                    Thread.sleep(lineDelay[i]);
                }

                // Ending text
                lyricsLabel.setText("🙂");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(IsipLyrics::new);
    }
}

