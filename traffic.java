import java.applet.*;
import java.awt.*;
//<applet code="traffic.class" width="500" height="700"></applet>
public class traffic extends Applet
{
public void paint (Graphics g)
    {
        g.setColor(Color.GRAY);
        g.fillRect(140, 390, 20, 200);
    try
        {
            g.setColor(Color.GRAY);
            g.fillRoundRect(100, 100, 100, 300, 30, 30);
            g.setColor(Color.RED);
            g.fillOval(120, 120, 60, 60);

            g.setColor(Color.BLACK);
            g.fillOval(120, 200, 60, 60);

            g.setColor(Color.BLACK);
            g.fillOval(120, 280, 60, 60);
            Thread.sleep(5000);
        }catch(Exception e){}
     try
        {
            g.setColor(Color.GRAY);
            g.fillRoundRect(100, 100, 100, 300, 30, 30);
            g.setColor(Color.BLACK);
            g.fillOval(120, 120, 60, 60);

            g.setColor(Color.YELLOW);
            g.fillOval(120, 200, 60, 60);

            g.setColor(Color.BLACK);
            g.fillOval(120, 280, 60, 60);
            Thread.sleep(5000);
        }catch(Exception e){}
    try
       {
            g.setColor(Color.GRAY);
            g.fillRoundRect(100, 100, 100, 290, 30, 30);

            g.setColor(Color.BLACK);
            g.fillOval(120,120,60,60);

            g.setColor(Color.BLACK);
            g.fillOval(120,200,60,60);
            g.setColor(Color.GREEN);
            g.fillOval(120,280,60,60);

            Thread.sleep(5000);
       }catch(Exception e){}
      g.setColor(Color.GRAY);
       g.fillRect(150,390,20,200);
}
}
