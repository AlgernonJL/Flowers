package flowers;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class Flow3_2 extends JFrame{
	public Flow3_2(){
		super("Colorful");
		setContentPane(new Insides());
		setSize(600,600);
		setVisible(true);
		setResizable(false);
	}
	
	class Insides extends JPanel{

		Color[] clrs = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.GREEN.darker(),
				Color.CYAN.darker(),Color.CYAN,Color.BLUE,Color.MAGENTA,Color.PINK};
		int centX = 600/2;
		int centY = 600/2;
		int loop = 0;
		Rectangle2D.Double rect = new Rectangle2D.Double(centX+50, centY+50, 100, 100);
		
		public Insides(){
			Timer timer = new Timer(50, new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
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
			System.out.println(loop);
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

