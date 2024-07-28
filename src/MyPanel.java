import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel
{
    MyPanel()
    {
        this.setPreferredSize(new Dimension(400,400));
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d= (Graphics2D) g;


        g2d.setStroke(new BasicStroke(3));
        g2d.setPaint(Color.BLUE);

        g2d.drawLine(0,0,500,500);
        g2d.drawRect(0,110,100,100);
        //Draws the outline of a given shape, rectangle or square depending on your choice.
        g2d.setPaint(Color.RED);
        g2d.fillRect(0,110,100,100);

        g2d.setPaint(Color.yellow);
        g2d.drawOval(280,0,100,100);

        g2d.setPaint(Color.orange);
        g2d.fillOval(280,0,100,100);

        g2d.setPaint(Color.RED);
        g2d.fillArc(0,280,100,100,0,180);
        g2d.setPaint(Color.WHITE);
        g2d.fillArc(0,280,100,100,180,180);

        int[] xPoints={280,310,340};
        int[] yPoints={150,220,150};
        g2d.setPaint(Color.GREEN);
        g2d.drawPolygon(xPoints,yPoints,3);
        g2d.fillPolygon(xPoints,yPoints,3);
        g2d.setPaint(Color.RED);
        g2d.drawString("You got shapes all over!",270 ,230);
        g2d.setFont(new Font("Consolas",Font.BOLD,20));
    }
}
