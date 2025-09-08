import java.util.concurrent.TimeUnit;

public class NaiilangSong {
    public static void main(String[] args) {
        String [] lines = {
            "Tumingin ka sa akin",
            "Gusto kong linawin",
            "Naiilang ka ba 'pag tayo lang dal'wa?",
            "Sinasabi ko nga na atin ang mundo",
            "Walang ibang tulad mo, woah...",
        };

        double[] charDelays = {0.20, 0.20, 0.18, 0.20, 0.25};
        double[] lineDelays = {0.20, 0.18, 0.18, 0.19, 0.25};

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
