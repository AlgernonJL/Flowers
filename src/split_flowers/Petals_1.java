package split_flowers;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Petals_1 extends JPanel{
	int centX;
	int centY;
	Color clr;
	int width;
	int length;
	int ammount;
	int offset;
	
	public Petals_1(Color clr, int width, int length, int ammount,int offset){
		this.clr=clr;
		this.width=width;
		this.length=length;
		this.ammount=ammount;
		this.offset=offset;
		setOpaque(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		centX = getSize().width/2;
		centY = getSize().height/2;
		
		g2.rotate(Math.toRadians(offset),centX,centY);
		int loop =0;
		while(loop<ammount){
			g2.setPaint(clr);
			g2.fill(new Ellipse2D.Double(centX-width/2, centY, width,length));
			g2.setPaint(Color.BLACK);
			g2.setStroke(new BasicStroke(1));
			g2.draw(new Ellipse2D.Double(centX-width/2, centY, width,length));
			g2.rotate(Math.toRadians(360/ammount),centX,centY);
			loop++;
		}
	}
	
}
