import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame
{
    JButton button1 = new JButton("Button #1");
    JButton button2 = new JButton("Button #2");
    JButton button3 = new JButton("Button #3");

    JButton myButton= new JButton("MY Button!");

    MyFrame()
    {
        myButton.setBounds(100,100,200,100);

        myButton.addActionListener(
                (e)-> System.out.println("Button all good, my G!")
                //We thought inner classes made things easy, but this is a whole other level of convenience! :)
        );

        button2.setBounds(100,250,200,100);

        button2.addActionListener(
                (e)-> System.out.println("This one too!")
                //How fun!
        );

        this.add(myButton);
        this.add(button2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.setVisible(true);
    }
}
