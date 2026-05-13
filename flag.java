import java.applet.*;
import java.awt.*;
//<applet code="flag.class" width="500" height="500"></applet>
public class flag extends Applet
{
  public void paint (Graphics g)
  {
    g.setColor(Color.BLACK);
    g.fillRect(0,0,10000,10000);
    g.setColor(Color.ORANGE);
    g.fillRect(100,100,400,100);
    g.setColor(Color.WHITE);
    g.fillRect(100,200,400,100);
    g.setColor(Color.GREEN);
    g.fillRect(100,300,400,100);
    g.setColor(Color.BLUE);
    g.fillOval(250,200,100,100);
  }
}
