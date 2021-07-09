import java.applet.*;
import java.awt.*;

public class two extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {

        g.setColor(Color.cyan);
        g.fillOval(20, 20, 150, 150);
        g.setColor(Color.black);
        g.fillOval(50, 60, 15, 25);
        g.fillOval(120, 60, 15, 25);
        int x[] = { 95, 85, 106, 95 };
        int y[] = { 85, 104, 104, 85 };
        g.drawPolygon(x, y, 4);
        g.drawArc(55, 95, 78, 50, 0, -180);
        g.drawLine(50, 126, 60, 116);
        g.drawLine(128, 115, 139, 126);
    }
}
/* <applet code="two" width="120" height="180"> </applet> */