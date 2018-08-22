package test.main.graphics.swing.yinyang;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleGraphicsSwing {

	public static void createAndShowCentralizedFrame() {
		JFrame mainF = createCentralizedFrame("HELLO");
		mainF.setVisible(true);
	}
	
	public static JFrame createCentralizedFrame(String title) {
		JFrame mainF = new JFrame(title);

		double scrHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		double scrWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

		Double winHeight = scrHeight / 2;
		Double winWidth = scrWidth / 2;

		Double startPosHorizontal = (scrWidth - winWidth) / 2;
		Double startPosVertical = (scrHeight - winHeight) / 2;

		mainF.setBounds(startPosHorizontal.intValue(), startPosVertical.intValue(), winWidth.intValue(),
				winHeight.intValue());
		
		mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return mainF;
	}
	
	public static void drawYinYang() {
		final JFrame mainFrame = createCentralizedFrame("YinYangFrame");
		
		final JPanel board = new YinYangPanel();
		mainFrame.add(board, BorderLayout.CENTER);
		mainFrame.setVisible(true);
	}
}
