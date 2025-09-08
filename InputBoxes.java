import javax.swing.JOptionPane;

public class InputBoxes {

    public static void main(String[] args) {
        
        String first_name = JOptionPane.showInputDialog("Name: ");
        String question = JOptionPane.showInputDialog("Lab mo ko? (oo/hindi)");

        String message;

        if (question.equalsIgnoreCase("oo")) {
            message = "hehe lab you " + first_name + ";)"; ;
        } else if (question.equalsIgnoreCase("hindi")) {
            message = "Edi wag mo na ako kausapin, " ;
        } else {
            message = "Invalid answer. Please type 'oo' or 'hindi'.";
        }

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}