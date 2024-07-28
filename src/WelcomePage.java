//For WelcomePage.java
import javax.swing.*;
import java.awt.*;

public class WelcomePage
{
    JFrame frame2= new JFrame();
    JLabel  label2= new JLabel();
    WelcomePage(String userID)
    {
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500,500);
        frame2.setLayout(null);

        label2.setBounds(0,0,200,35);
        label2.setFont(new Font(null,Font.PLAIN,20));
        label2.setText("Hello "+userID);

        frame2.add(label2);
        frame2.setVisible(true);
    }
}
