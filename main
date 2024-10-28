import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Converter c = new Converter();
        Object[] option1 = {"EURO", "NOK", "YEN", "QUIT"};
        Object[] option2 = {"Try again", "QUIT"};

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Please Enter a Value: ");
            System.out.println(input);

            if (c.checkValue(input) == true) {
                double Minput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Choose Which Currency You Wish to Convert", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                if (choice1 == 0) { // EURO option
                    c.dollarToEuro(Minput);
                    
                    int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 != 0) {
                        break;
                    }
                    
                } else if (choice1 == 1) { // NOK option
                    c.dollarToNok(Minput);
                    
                    int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 != 0) {
                        break;
                    }
                    
                } else if (choice1 == 2) { // YEN option
                    c.dollarToJPY(Minput);
                    
                    int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 != 0) {
                        break;
                    }
                    
                } else { // QUIT option
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input, Please Try Again!");

                int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                if (choice2 != 0) {
                    break;
                }
            }
        }
    }
}
