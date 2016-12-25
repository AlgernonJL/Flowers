package flowers;

import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class Flow2 extends Canvas{
	
	public void paint(Graphics g){
		int centX = getSize().width/2;
		int centY = getSize().height/2;
		Graphics2D g2 = (Graphics2D)g;
		
		Line2D.Float line = new Line2D.Float(centX, centY, centX+200, centY);
		g2.draw(line);
		
		int loop=0;
		while(loop<179){
			g2.rotate(Math.toRadians(2),centX,centY);
			g2.draw(line);
			loop++;
		}
		
		g2.finalize();
	}
	
	public static void main(String[] args) {
		Flow2 fl = new Flow2();
		JFrame fr = new JFrame();
		
		fr.add(fl);
		fr.setSize(600,600);
		fr.setVisible(true);
	}
}
