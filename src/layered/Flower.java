package layered;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import split_flowers.Middle_1;
import split_flowers.Middle_2;

@SuppressWarnings("serial")
public class Flower extends JFrame{
	public Flower(){
		super("Flower");
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);
		jp.add(new Middle_1(Color.BLACK,40,40,20));
		jp.add(new Middle_2(Color.WHITE,100));
		jp.add(new DiamSquares(12,50,0));
		jp.add(new DiamSquares(12,60,15));
		jp.add(new DiamSquares(12,73,0));
		jp.add(new DiamSquares(12,88,15));
		jp.add(new DiamSquares(12,106,0));
		jp.add(new DiamSquares(12,128,15));
		jp.add(new DiamSquares(12,156,0));
		jp.add(new DiamSquares(12,190,15));
		jp.add(new DiamSquares(12,230,0));
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
