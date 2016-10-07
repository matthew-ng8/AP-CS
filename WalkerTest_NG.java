import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest_NG extends JPanel
{
    private Walker walks;
    private int x =  -800, y = 100;

    // Constructor
    public WalkerTest_NG()
    {
        walks = new Walker(x, y, (new ImageIcon("leftshoe.gif")).getImage(), (new ImageIcon("rightshoe.gif")).getImage());
        
    }

    // Called automatically when the panel needs repainting
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for(int count = 0; count <=4;count++){
            if(count !=3)
                walks.draw(g);
            walks.firstStep();
            walks.nextStep();
            walks.stop();
            
        }

        
        // Draw a cursor at the expected center of the first "shoe":
        g.drawLine(x - 50, y, x + 50, y);
        g.drawLine(x, y - 50, x, y + 50);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Walks");
        window.setBounds(100, 100, 800, 480);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        WalkerTest_NG panel = new WalkerTest_NG();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);

        window.setVisible(true);
    }
}