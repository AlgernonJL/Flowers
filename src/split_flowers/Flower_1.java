package split_flowers;

import java.awt.*;

import javax.swing.*;

public class Flower_1 {
	public static void main(String[] args) {
		JFrame fr = new JFrame();
		JPanel jp = new JPanel();
		LayoutManager overlay = new OverlayLayout(jp);
		jp.setLayout(overlay);
		
		jp.add(new Middle(Color.BLACK,50,200,5));
		jp.add(new Middle(Color.BLACK,50,20,10));
		fr.add(jp);
		fr.setSize(600, 600);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
