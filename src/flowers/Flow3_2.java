package flowers;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class Flow3_2 extends JFrame{
	public Flow3_2(){
		super("Colorful");
		setSize(600,600);
		setContentPane(new Insides());
		setVisible(true);
		setResizable(false);
	}
	
	class Insides extends JPanel{

		Color[] clrs = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.GREEN.darker(),
				Color.CYAN.darker(),Color.CYAN,Color.BLUE,Color.MAGENTA,Color.PINK};
		int centX;
		int centY;
		int loop = 0;
		Rectangle2D.Double rect;
		
		public Insides(){
			
			Timer timer = new Timer(50, new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					if(loop==0){
						centX = getSize().width/2;
						centY = getSize().height/2;
						rect = new Rectangle2D.Double(centX+50, centY+50, 100, 100);
					}
					repaint();
					loop++;
				}
			});
			timer.start();
		}
		
		public void paintComponent(Graphics g){
			Graphics2D g2 = (Graphics2D) g;
			g2.rotate(Math.toRadians(-135+loop*10),centX,centY);
			g2.setPaint(clrs[loop%clrs.length]);
			g2.fill(rect);
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				new Flow3_2();
			}
		});
	}
}

