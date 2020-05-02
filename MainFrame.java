import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private TextPanel textPanel;
    private  ToolBar toolBar;
    private FormPanel formPanel;

    public MainFrame() {
        //title on the window
        super(" ");

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolBar = new ToolBar();
        formPanel = new FormPanel();

        //add components to the BorderLayout
        add(toolBar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.WEST);

        //initiates the visibility of the window
        setVisible(true);
        //ensure the program ends when the X is clicked
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);

        formPanel.setFormListener(new FormListener() {
            @Override
            public void formEventOccured(FormEvent event) {
                String name = event.getName();
                String occupation = event.getOccupation();

                textPanel.appendText(name+": "+occupation+"\n");
            }
        });

        toolBar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text + "\n");
            }
        });
    }



}
