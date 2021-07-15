package APPLETS.BLUEJ.PROJ2;

import java.applet.Applet;

import java.awt.*;

public class test extends Applet
 {
     
public void paint(Graphics g)
{
  g.setColor(Color.blue);
for(int i=100,j=100,x=200,y=200;i<400;i+=40,j+=40,x-=20,y-=20)
{
g.drawRect(x,y,i,j);

}
}
}