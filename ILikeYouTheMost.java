import javax.swing.*;
import java.awt.*;

public class ILikeYouTheMost extends JFrame {
    private JLabel lyricsLabel;

    
    private String[] lyrics = {
        "'Cause you're the one that I like, I can't deny",
        "Every night you're on my mind",
        "So, if I call you tonight",
        "Will you pick up and give me your time?",
        "Miss you every night, miss you all the time",
        "No, I don't even know where to start",
        "'Cause you're the one that I like, I can't deny",
        "Everything I feel inside",
        "Will you tell me I'm the one",
        "The one inside of your heart?",
        "Used to brush aside, now I can't deny",
        "That, baby, you're my special one",
        "'Cause you're the one that I like"
    };

    
    private int charDelay = 70;   
    private int lineDelay = 800; 

    public ILikeYouTheMost() {
        
        setTitle("I Like You The Most - Lyrics");
        setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

       
        lyricsLabel = new JLabel("", SwingConstants.CENTER);
        lyricsLabel.setFont(new Font("Serif", Font.PLAIN, 22));
        add(lyricsLabel, BorderLayout.CENTER);

        
        setLocationRelativeTo(null);
        setVisible(true);

        
        displayLyrics();
    }

    private void displayLyrics() {
        new Thread(() -> {
            try {
                for (String line : lyrics) {
                    StringBuilder text = new StringBuilder();

                    
                    for (char c : line.toCharArray()) {
                        text.append(c);
                        lyricsLabel.setText(text.toString());
                        Thread.sleep(charDelay);
                    }

                   
                    Thread.sleep(lineDelay);
                }

                
                lyricsLabel.setText("💞 'Cause you're the one that I like 💞");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ILikeYouTheMost::new);
    }
}
