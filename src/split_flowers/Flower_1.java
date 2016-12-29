package split_flowers;

import java.awt.*;
import javax.swing.*;

public class Flower_1 extends JFrame{
	private static final long serialVersionUID = 3752120557796563206L;

	public Flower_1() {
		super("Flower_1");
		
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);

		jp.add(new Middle_1(Color.BLACK,50,50,10));
		jp.add(new Middle_1(Color.BLACK,50,100,10));
		jp.add(new Middle_1(Color.BLACK,50,150,10));
		jp.add(new Middle_1(Color.BLACK,50,200,10));
		add(jp);
	}
	
	public static void main(String[] args) {
		Flower_1 fl1 = new Flower_1();
		fl1.setSize(600, 600);
        fl1.setVisible(true);
        fl1.setResizable(false);
        fl1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
