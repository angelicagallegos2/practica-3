
package proyectoconcurrente;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PanelBall extends JPanel{
        private Mix x;
        private Miy y;
        private NumeroBall n;
    
    public PanelBall(Mix x,Miy y, NumeroBall n){
      this.x=x; 
      this.y=y;
      this.n=n;
    }

    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(x.getX(), y.getY(), 20, 20));
        g2.setColor(Color.BLACK);
        g2.drawString(String.valueOf(n.getCont()),x.getX()+8,y.getY()+12);
    }
}
