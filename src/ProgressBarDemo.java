import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo
{
    JFrame frame1= new JFrame();
    JProgressBar bar1= new JProgressBar(0,100);
    ProgressBarDemo()
    {
        bar1.setValue(0);
        bar1.setBounds(0,50,500,50);
        bar1.setStringPainted(true);
        /*This last method adds a percentage value to your progress bar, which, with further modifications,
        will be constantly updated with the progress of the progress bar.
         */
        bar1.setFont(new Font("Comic Sans",Font.BOLD,30));


        bar1.setForeground(Color.RED);
        bar1.setBackground(Color.BLACK);

        frame1.add(bar1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600,600);
        frame1.setLayout(null);
        frame1.setVisible(true);

        fill();
    }

    public void fill()
    {
        int counter=0;
        while (counter<=100)
        {
            bar1.setValue(counter);
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            counter+=1;
        }
        bar1.setString("It's done!");
    }
}
