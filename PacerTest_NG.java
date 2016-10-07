
/**
 * Write a description of class PacerTest_NG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
public class PacerTest_NG extends JPanel
{

    private Pacer paces;
    private int x =  800, y = 500;

    // Constructor
    public PacerTest_NG()
    {
        paces = new Pacer(x, y, (new ImageIcon("leftshoe.gif")).getImage(), (new ImageIcon("rightshoe.gif")).getImage());

    }

    // Called automatically when the panel needs repainting
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        paces.turnAround();
        
        for(int count =1 ; count <=4;count++){
            paces.draw(g);
            paces.firstStep();
            paces.nextStep();
            paces.stop();
           // paces.turnRight();

        }

        // Draw a cursor at the expected center of the first "shoe":
        g.drawLine(x - 50, y, x + 50, y);
        g.drawLine(x, y - 50, x, y + 50);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Paces");
        window.setBounds(100, 100, 800, 480);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacerTest_NG panel = new PacerTest_NG();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);

        window.setVisible(true);
    }
}

