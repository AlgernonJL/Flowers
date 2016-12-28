package split_flowers;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Middle extends JPanel{
	private static final long serialVersionUID = 4790958990253702306L;
	int centX;
	int centY;
	int length;
	int width;
	int angle;
	Color clr;
	
	public Middle(Color clr,int length,int width,int angle){
		this.clr = clr;
		this.length = length;
		this.width = width;
		this.angle = angle;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(clr);
		
		centX = getSize().width/2;
		centY = getSize().height/2;
		
		int loop = 0;
		while(loop < 360/angle){
			g2.draw(new Ellipse2D.Double(centX, centY, length, width));
			g2.rotate(Math.toRadians(angle),centX,centY);
			loop++;
		}
		
	}
}
