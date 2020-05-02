import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener{

    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener textListener;

    public ToolBar(){

        //this create a border for the buttons
        setBorder(BorderFactory.createEtchedBorder());

        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Good bye");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);
    }

  public void setStringListener(StringListener listener){
        this.textListener = listener;
  }

    //action lister that gets activated whenever the button its clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if(clicked == helloButton){
            if (textListener != null){
                textListener.textEmitted(helloButton.getText());
            }
          //  textPanel.appendText(helloButton.getText()+"\n");
        }else if (clicked == goodbyeButton){
            if (textListener != null){
                textListener.textEmitted(goodbyeButton.getText());
            }
         //   textPanel.appendText(goodbyeButton.getText()+"\n");
        }
    }
}
