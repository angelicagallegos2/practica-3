
package proyectoconcurrente;
import javax.swing.*;
public class Ball extends Thread{
    private PanelBall panel;
    private Mix x;
    private Miy y;
    private int dx,dy;
    Ball(PanelBall panel,Mix x,Miy y){
        this.panel=panel;
        this.x=x;
        this.y=y;
        dx=8;
        dy=8;
    }
     public void run(){
         while(true){
             try{
                 
                 y.setY(y.getY()+dy);
                 x.setX(x.getX()+dx);                 
                 if (y.getY()+dy>300 || y.getY()+dy<0)
                     dy=-dy;
                 if (x.getX()+dx>400 || x.getX()+dx<0)
                     dx=-dx;
                 panel.repaint();
                 Thread.sleep(100);
             }catch(Exception e){e.printStackTrace();}
         }
             
     }                   
}
