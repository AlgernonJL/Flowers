package chrysanthemum;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

@SuppressWarnings("serial")
public class Chrysanthemum extends JFrame{
	public Chrysanthemum(){
		super("Chrysanthemum");
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);
		DiamSquares ds;
		
		double length = 10;
		int number = 20;
		int loopmax=30;
		
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
		jp.add(new InscribedCircle((int)length+5));
		jp.add(new InscribedCircle((int)length+10));
		add(jp);
	}
	
	public static void main(String[] args) {
		Chrysanthemum fl = new Chrysanthemum();
		fl.setSize(800, 800);
        fl.setVisible(true);
        fl.setResizable(false);
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
