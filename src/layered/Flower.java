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
		DiamSquares ds;
		
		double length = 10;
		int number = 12;
		int loopmax=18;
		
		int loop = 0;
		while(loop<loopmax){
			if(loop%2==0){
				ds = new DiamSquares(number,(int) length,0);
			}else{
				ds = new DiamSquares(number,(int) length,360/(number*2));
			}
			length = ds.getDisplace();
			jp.add(ds);
			loop++;
		}
		jp.add(new InscribedCircle((int)length));
		add(jp);
	}
	
	public static void main(String[] args) {
		Flower fl = new Flower();
		fl.setSize(700, 700);
        fl.setVisible(true);
        fl.setResizable(false);
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
