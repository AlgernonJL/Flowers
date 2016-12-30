package layered;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DiamSquares extends JPanel{
	int ammount;
	int radius;
	int degOffset;
	
	double deg;
	double offset;
	double length;
	
	public DiamSquares(int amm,int rad,int set){
		this.ammount=amm;
		this.radius=rad;
		this.degOffset=set;
		
		deg=Math.toRadians(360/(2*ammount));
		offset = Math.sqrt(0.5*Math.pow(radius*(Math.cos(deg)-Math.sin(deg)),2));
		length = Math.sqrt(0.5*Math.pow(2*radius*Math.sin(deg),2));
		setOpaque(false);
	}
	
	public double getDisplace(){
		return Math.sqrt(Math.pow(offset, 2)*2)+Math.sqrt(Math.pow(length, 2)*2);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		int centX = getSize().width/2;
		int centY = getSize().height/2;
		int loop=0;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.rotate(Math.toRadians(degOffset), centX, centY);
		while(loop<ammount){
			g2.setPaint(Color.WHITE);
			g2.fill(new Rectangle2D.Double(centX+offset, centY+offset, length, length));
			g2.setPaint(Color.BLACK);
			g2.draw(new Rectangle2D.Double(centX+offset, centY+offset, length, length));
			g2.rotate(Math.toRadians(360/(ammount)),centX,centY);
			loop++;
		}
	}
}
