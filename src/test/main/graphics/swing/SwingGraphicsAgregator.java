package test.main.graphics.swing;

import test.main.graphics.swing.yinyang.SampleGraphicsSwing;

public class SwingGraphicsAgregator {

	public static void myFileGraphicsTest() {
		MySwingUtilsappMenuWindow menu = new MySwingUtilsappMenuWindow();
		MySwingUtilsappMenuWindow.main(new String[]{});
	}

	public static void sampleGraphicsExample() {
		SampleGraphicsSwing.createCentralizedFrame("some windwow title");
		SampleGraphicsSwing.drawYinYang();
	}

}
