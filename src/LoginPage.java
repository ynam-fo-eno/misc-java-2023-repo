//For LoginPage.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;
public class LoginPage implements ActionListener
{
    JFrame frame1= new JFrame();
    JButton button1= new JButton("Login");
    JButton button2= new JButton("Reset");

    JTextField iDSpace= new JTextField();
    JPasswordField passwordSpace= new JPasswordField();

    JLabel idLabel= new JLabel("User ID: ");
    JLabel passwordLabel= new JLabel("Password: ");
    JLabel messageBox= new JLabel();
    HashMap<String,String>loginInfo= new HashMap<String,String>();
    LoginPage(HashMap<String,String>loginInfoOG)
    {
        loginInfo= loginInfoOG;

        idLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);
        messageBox.setBounds(125,250,450,45);
        messageBox.setFont(new Font(null,Font.ITALIC,25));

        iDSpace.setBounds(125,100,200,25);
        passwordSpace.setBounds(125,150,200,25);

        button1.setBounds(125,200,100,25);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(225,200,100,25);
        button2.setFocusable(false);
        button2.addActionListener(this);


        frame1.add(idLabel);
        frame1.add(passwordLabel);
        frame1.add(messageBox);
        frame1.add(iDSpace);
        frame1.add(passwordSpace);
        frame1.add(button1);
        frame1.add(button2);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600,600);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            String userID= iDSpace.getText();
            String password= String.valueOf(passwordSpace.getPassword());

            if(loginInfo.containsKey(userID))
            {
                if(loginInfo.get(userID).equals(password))
                {
                    messageBox.setForeground(Color.GREEN);
                    messageBox.setText("All good, credentials confirmed!");
                    frame1.dispose();
                    //Optional, bit closes this login frame and leaves you only to welcome page.
                    WelcomePage userEntry= new WelcomePage(userID);
                }
                else
                {
                    messageBox.setForeground(Color.RED);
                    messageBox.setText("Incorrect paasword. Login declined.");
                }
            }
            else
            {
                messageBox.setForeground(Color.RED);
                messageBox.setText("Username absent!!!");
            }

        }

        if(e.getSource()==button2)
        {
            iDSpace.setText("");
            passwordSpace.setText("");
        }
    }
}
