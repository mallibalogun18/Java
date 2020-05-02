import javax.swing.*;

public class HelloGUI {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                JFrame frame = new JFrame("Develop GUI");
//                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                frame.setVisible(true);
//                frame.setSize(600,600);
                new MainFrame();
            }
        });
    }
}
