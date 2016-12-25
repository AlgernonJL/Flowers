package flowers;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Flow1 extends Canvas{

	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Dimension d = getSize();
		g2.drawOval(d.width/2 - 50,d.height/2 - 50, 100, 100);
		setBackground(Color.WHITE);
	}
	
	public static void main(String[] args) {
		Flow1 f = new Flow1();
		JFrame fr = new JFrame();
		fr.add(f);
		fr.setSize(550, 550);
        fr.setVisible(true);
	}
}
