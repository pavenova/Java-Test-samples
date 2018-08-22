package test.main.graphics.swing.filereaderprinter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FileReaderMainForm {

	private JFrame frame;
	
	private JButton btwOpenFile;
	private JButton btnExit;
	private JTextArea textArea;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileReaderMainForm window = new FileReaderMainForm();
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
	public FileReaderMainForm() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		btwOpenFile = new JButton("Open file");
		frame.getContentPane().add(btwOpenFile, BorderLayout.NORTH);
		
		btnExit = new JButton("Exit app");
		frame.getContentPane().add(btnExit, BorderLayout.SOUTH);
		
		textArea = new JTextArea();
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		this.textArea.setEditable(false);
	}
	
	public void setTextAreaContent(String text) {
		this.textArea.setText(text);
	}
	
	public void addListeners(ActionListener aLButton) {
		addExitListener();
		addFileButtonListener(aLButton);
	}

	private void addExitListener() {
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  frame.dispose();
			}
		});
	}
	
	private void addFileButtonListener(ActionListener aL) {
		btwOpenFile.addActionListener(aL);
	}
	 
}
