package layered;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InscribedCircle extends JPanel{
	int radius;
	
	public InscribedCircle(int radius){
		this.radius=radius;
		setOpaque(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		int centX = getSize().width/2;
		int centY = getSize().height/2;
		g2.draw(new Ellipse2D.Double(centX-radius, centY-radius, 2*radius,2*radius));
	}
}
