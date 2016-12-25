package flowers;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Flow3 extends Canvas{
	
	public void paint(Graphics g){
		Color[] clrs = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.GREEN.darker(),
				Color.CYAN.darker(),Color.CYAN,Color.BLUE,Color.MAGENTA,Color.PINK};
		
		int centX = getSize().width/2;
		int centY = getSize().height/2;
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D.Double rect = new Rectangle2D.Double(centX+50, centY+50, 100, 100);
		g2.rotate(Math.toRadians(-135),centX,centY);
		int loop = 0;
		while(loop<37){
			g2.setPaint(clrs[loop%clrs.length]);
			g2.fill(rect);
			g2.rotate(Math.toRadians(10), centX, centY);
			loop++;
		}
		g2.finalize();
	}
	
	public static void main(String[] args) {
		Flow3 fl = new Flow3();
		JFrame fr = new JFrame();
		
		fr.add(fl);
		fr.setSize(600,600);
		fr.setVisible(true);
	}
}