package flowers;
import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class Flow1 extends Canvas{

	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Dimension d = getSize();
		int centX = d.width/2;
		int centY = d.height/2;
		Ellipse2D.Double rect = new Ellipse2D.Double(centX,centY, 50, 50);
		g2.draw(rect);
		
		int loop = 0;
		int num = 10;
		while(loop< (360/num - 1)){
			g2.rotate(Math.toRadians(num),centX,centY);
			g2.draw(rect);
			loop++;
		}
		setBackground(Color.WHITE);
	}
	
	public static void main(String[] args) {
		Flow1 f = new Flow1();
		JFrame fr = new JFrame();
		fr.add(f);
		fr.setSize(550, 550);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
