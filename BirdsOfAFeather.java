import java.util.concurrent.TimeUnit;
public class BirdsOfAFeather {
    public static void main(String[] args) {
        String [] lines = {
            "And I don't know what I'm cryin' for",
            "I don't think I could love you more",
            "It might not be long, but baby, I...",
            "I'll love you 'til the day that I die",
            "'Til the day that I die..",
            "'Til the light leaves my eyes",
            "'Til the day that I die..",
        };

        double[] charDelays = {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
        double[] lineDelays = {0.2, 0.2, 0.3, 0.2, 0.3, 0.2, 0.2};

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
            for (char c: line.toCharArray()){
                System.out.print(c);
                System.out.flush();
                try {
                    TimeUnit.MILLISECONDS.sleep((long)(charDelay * 1000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }   
    
    }


