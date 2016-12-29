package split_flowers;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Middle_2 extends JPanel{
	int centX;
	int centY;
	Color clr;
	int rad;
	
	public Middle_2(Color clr, int rad){
		this.clr = clr;
		this.rad = rad;
		setOpaque(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		centX = getSize().width/2;
		centY = getSize().height/2;
		
		g2.setPaint(clr);
		g2.fill(new Ellipse2D.Double(centX-rad/2, centY-rad/2, rad,rad));
		g2.setPaint(Color.BLACK);
		g2.setStroke(new BasicStroke(1));
		g2.draw(new Ellipse2D.Double(centX-rad/2, centY-rad/2, rad,rad));
		
	}
}
