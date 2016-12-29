package layered;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

@SuppressWarnings("serial")
public class Flower extends JFrame{
	public Flower(){
		super("Flower");
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);
		jp.add(new DiamSquares(12,200,0));
		jp.add(new InscribedCircle(200));
		add(jp);
	}
	
	public static void main(String[] args) {
		Flower fl = new Flower();
		fl.setSize(600, 600);
        fl.setVisible(true);
        fl.setResizable(false);
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
