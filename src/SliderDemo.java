import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener
{
    JFrame frame1;
    JPanel panel1;
    JLabel label1;

    JSlider slider1;
    SliderDemo()
    {
        frame1= new JFrame("Slider Demo");
        panel1=new JPanel();
        label1= new JLabel();

        slider1= new JSlider(0,100,50);
        slider1.setPreferredSize(new Dimension(200,200));
        slider1.setPaintTicks(true);
        slider1.setMinorTickSpacing(5);
        slider1.setPaintTrack(true);
        slider1.setMajorTickSpacing(10);
        slider1.setPaintLabels(true);
        slider1.setFont(new Font("Times New Roman", Font.ITALIC,20));
        slider1.setOrientation(SwingConstants.VERTICAL);
        slider1.addChangeListener(this);

        label1.setFont(new Font("Times New Roman", Font.ITALIC,30));


        panel1.add(label1);
        panel1.add (slider1);
        frame1.add(panel1);
        frame1.setSize(600,600);
        frame1.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        label1.setText("Value in degrees Celsius= "+ slider1.getValue());
    }
}
