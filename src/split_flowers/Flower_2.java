package split_flowers;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class Flower_2 extends JFrame{
	public Flower_2() {
		super("Flower_2");
		
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);

		jp.add(new Middle_1_2(Color.YELLOW,50,20,10));
		jp.add(new Petals_1(Color.ORANGE,10,100,12,0));
		jp.add(new Petals_1(Color.ORANGE,10,100,12,5));
		jp.add(new Petals_1(Color.ORANGE,10,100,12,10));
		jp.add(new Petals_1(Color.ORANGE,10,100,12,15));
		jp.add(new Petals_1(Color.ORANGE,10,100,12,20));
		jp.add(new Petals_1(Color.ORANGE,10,100,12,25));
		jp.add(new Petals_1(Color.ORANGE,15,150,12,0));
		jp.add(new Petals_1(Color.ORANGE,15,150,12,5));
		jp.add(new Petals_1(Color.ORANGE,15,150,12,10));
		jp.add(new Petals_1(Color.ORANGE,15,150,12,15));
		jp.add(new Petals_1(Color.ORANGE,15,150,12,20));
		jp.add(new Petals_1(Color.ORANGE,15,150,12,25));
		jp.add(new Petals_1(Color.ORANGE,20,200,12,0));
		jp.add(new Petals_1(Color.ORANGE,20,200,12,5));
		jp.add(new Petals_1(Color.ORANGE,20,200,12,10));
		jp.add(new Petals_1(Color.ORANGE,20,200,12,15));
		jp.add(new Petals_1(Color.ORANGE,20,200,12,20));
		jp.add(new Petals_1(Color.ORANGE,20,200,12,25));
		add(jp);
	}
	
	public static void main(String[] args) {
		Flower_2 fl = new Flower_2();
		fl.setSize(600, 600);
        fl.setVisible(true);
        fl.setResizable(false);
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
