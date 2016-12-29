package split_flowers;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Middle_1_2 extends JPanel{
	private static final long serialVersionUID = 4790958990253702306L;
	int centX;
	int centY;
	int width;
	int length;
	int angle;
	Color clr;
	
	public Middle_1_2(Color clr,int width,int length,int angle){
		this.clr = clr;
		this.width = width;
		this.length = length;
		this.angle = angle;
		setOpaque(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(clr);
		
		centX = getSize().width/2;
		centY = getSize().height/2;
		
		int loop = 0;
		while(loop < 360/angle){
			g2.setPaint(clr);
			g2.fill(new Ellipse2D.Double(centX, centY, width, length));
			g2.setPaint(Color.BLACK);
			g2.draw(new Ellipse2D.Double(centX, centY, width, length));
			g2.rotate(Math.toRadians(angle),centX,centY);
			loop++;
		}
		
	}
}
