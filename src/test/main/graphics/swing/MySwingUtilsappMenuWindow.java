package test.main.graphics.swing;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.main.graphics.swing.drawings.MySwingDrawings;
import test.main.graphics.swing.filereaderprinter.SwingFileReaderPrinterControlClass;

public class MySwingUtilsappMenuWindow {

	private JFrame frame;
	private JButton btnFileReader;
	private JButton btnDrawing;
	
	private SwingFileReaderPrinterControlClass readerControl; 
	private MySwingDrawings drawings;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwingUtilsappMenuWindow window = new MySwingUtilsappMenuWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MySwingUtilsappMenuWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initComponents();
	}



	private void initComponents() {
		initFrame();
		
		btnFileReader = new JButton("File reader");
		frame.getContentPane().add(btnFileReader);
		
		btnDrawing = new JButton("Drawing");
		frame.getContentPane().add(btnDrawing);
		
		initListeners();
	}
	
	private void initFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
	
	private void initListeners() {
		this.btnFileReader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				readerControl = new SwingFileReaderPrinterControlClass();
			}
		});
		
		this.btnDrawing.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				drawings =  new  MySwingDrawings();
				drawings.main(new String[] {});
			}
		});
	}

}
