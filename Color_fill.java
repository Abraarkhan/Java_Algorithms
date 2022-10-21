import java.applet.*;
import java.awt.*;

public class fillColor extends Applet {
   public void paint(Graphics g) {
      g.drawRect(300,150,200,100);
      g.setColor(Color.yellow);   
      g.fillRect( 300,150, 200, 100 );
      g.setColor(Color.magenta);
      g.drawString("Rectangle",500,150);
   }
}