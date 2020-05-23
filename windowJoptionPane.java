import javax.swing.*;

public class windowJoptionPane extends JOptionPane {

    public static void main(String[] args) {

        int exit = 0;

        while (exit != 1){
            String options[] = {"Warning", "Error", "Information", "Question","Plain"};

            int optionSelected = JOptionPane.showOptionDialog(null,
                    "Select one of the option to see a dialog",
                    "Option Selection",
                    JOptionPane.NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    "Plain");

            if(optionSelected == 0){
                JOptionPane.showMessageDialog(null,"You click the Warning button",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (optionSelected == 1){
                JOptionPane.showMessageDialog(null,"You click the Error button",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }else if (optionSelected == 2){
                JOptionPane.showMessageDialog(null,"You click the Information button",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            }else if (optionSelected == 3){
                JOptionPane.showMessageDialog(null,"You click the Question button",
                        "Question", JOptionPane.QUESTION_MESSAGE);
            }else if (optionSelected == 4){
                JOptionPane.showMessageDialog(null,"You click the PLain button",
                        "Plain", JOptionPane.PLAIN_MESSAGE);
            }
            try {
                exit = Integer.parseInt(JOptionPane.showInputDialog("Press 0 to exit the game"));
            } catch (NumberFormatException e){
                e.fillInStackTrace();
            }

        }

    }

}
