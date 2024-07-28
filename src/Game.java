import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Game
{
    JFrame frame1;
    JLabel label1;
    Action upAction,downAction,leftAction,rightAction;
    Game()
    {
        frame1= new JFrame("Key Bindings Intro");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600,600);
        frame1.setLayout(null);

        label1= new JLabel();
        label1.setBounds(200,200,200,200);
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);

        upAction= new UpAction();
        downAction= new DownAction();
        leftAction= new LeftAction();
        rightAction= new RightAction();

        label1.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        label1.getActionMap().put("upAction",upAction);
        label1.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        label1.getActionMap().put("downAction",downAction);
        label1.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        label1.getActionMap().put("leftAction",leftAction);
        label1.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        label1.getActionMap().put("rightAction",rightAction);

        frame1.add(label1);
        frame1.setVisible(true);
    }

    public class UpAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            label1.setLocation(label1.getX(),label1.getY()-10);
        }
    }

    public class DownAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            label1.setLocation(label1.getX(),label1.getY()+10);
        }
    }

    public class LeftAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            label1.setLocation(label1.getX()-10,label1.getY());
        }
    }

    public class RightAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            label1.setLocation(label1.getX()+10,label1.getY());
        }
    }

}
