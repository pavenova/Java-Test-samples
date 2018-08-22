package test.main.graphics.swing.filereaderprinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SwingFileReaderPrinterControlClass {

	public SwingFileReaderPrinterControlClass() {
		FileReaderMainForm form = new FileReaderMainForm();
	
		initEnv(form);
	}

	private void initEnv(FileReaderMainForm form) {
		form.addListeners(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				File chosenFile = getFileFromChooser();
				setTextOutput(form, chosenFile);
			}

			private void setTextOutput(FileReaderMainForm form, File chosenFile) {
				String fileText = readFile(chosenFile);
				form.setTextAreaContent(fileText);
			}

			private File getFileFromChooser() {
				JFileChooser chooser = createFileChooser();
				chooser.showOpenDialog(null);

				File chosenFile = chooser.getSelectedFile();
				return chosenFile;
			}

			private JFileChooser createFileChooser() {
				JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
				chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text files","txt"));
				return chooser;
			}
		});
	}

	private String readFile(File file) {
		if (file != null && file.exists()) {
			BufferedReader br = null;
			FileReader fr = null;
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String currLine;
				StringBuilder rs = new StringBuilder();

				while ((currLine = br.readLine()) != null) {
					rs.append("\n");
					rs.append(currLine);
				}

				return rs.toString();
			} catch (Exception e) {
				// not found or not exist
				e.printStackTrace();
				return null;
			} finally {
				try {
					br.close();
					fr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} else {
			return null;
		}
	}

}
