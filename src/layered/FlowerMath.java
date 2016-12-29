package layered;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class FlowerMath extends JFrame{
	public FlowerMath(){
		super("Flower");
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);
		jp.add(new Square());
		jp.add(new Circle());
		add(jp);
	}
	
	public static void main(String[] args) {
		FlowerMath fl = new FlowerMath();
		fl.setSize(600, 600);
        fl.setVisible(true);
        fl.setResizable(false);
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

@SuppressWarnings("serial")
class Circle extends JPanel{
	public Circle(){
		setOpaque(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setOpaque(false);
		Graphics2D g2 = (Graphics2D) g;
		int centX = getSize().width/2;
		int centY = getSize().height/2;
		int radius = 400;
		g2.draw(new Ellipse2D.Double(centX-radius/2, centY-radius/2, radius,radius));
	}
}

@SuppressWarnings("serial")
class Square extends JPanel{
	public Square(){
		setOpaque(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setOpaque(false);
		Graphics2D g2 = (Graphics2D) g;
		int centX = getSize().width/2;
		int centY = getSize().height/2;
		int squarenumber = 20;
		int radius=200;
		double deg=Math.toRadians(360/(2*squarenumber));
		
		double offset = Math.sqrt(0.5 * 
					Math.pow( radius * ( Math.cos(deg)-Math.sin(deg) ),2 )
				);
		double length = Math.sqrt(0.5*
				Math.pow(2*radius*Math.sin(deg), 2)
				);
		
		System.out.println(offset);
		System.out.println(length);
		
		int loop=0;
		while(loop<squarenumber){
			g2.draw(new Rectangle2D.Double(centX+offset, centY+offset, length, length));
			g2.rotate(Math.toRadians(360/(squarenumber)),centX,centY);
			loop++;
		}
	}
}