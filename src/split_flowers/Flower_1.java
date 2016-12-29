package split_flowers;

import java.awt.*;

import javax.swing.*;

public class Flower_1 {
	public static void main(String[] args) {
		JFrame fr = new JFrame();
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);

		jp.add(new Middle(Color.BLACK,50,50,10));
		jp.add(new Middle(Color.BLACK,50,100,10));
		jp.add(new Middle(Color.BLACK,50,150,10));
		jp.add(new Middle(Color.BLACK,50,200,10));
		fr.add(jp);
		fr.setSize(600, 600);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
