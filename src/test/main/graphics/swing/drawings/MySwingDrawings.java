package test.main.graphics.swing.drawings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MySwingDrawings {

	private JFrame frame;
	private JPanel menuPanel;
	private JPanel canvasPanel;

	private final String ICONSBASE = "src\\test\\main\\graphics\\swing\\drawings\\resources\\icons\\";

	private final String ICONPENCILAPTH = "pencil.png";
	private final String ICONRECT = "rectangle.png";
	private final String ICONOVAL = "oval.png";

	private final String ICONDISCARD = "cancel.png";
	private final String ICONPICKER = "colorpicker.png";

	private DrawingMode drawMode = DrawingMode.PENCIL;
	private Color drawingColor = Color.BLACK;

	private Point refPoint = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwingDrawings window = new MySwingDrawings();
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
	public MySwingDrawings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame();
		setComponents();
		setMenu();
		setCanvasListener();
	}

	private void setCanvasListener() {
		this.canvasPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				draw(e.getX(), e.getY(), e);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}

	private void draw(int x, int y, MouseEvent e) {
		switch (drawMode) {
		case PENCIL:
			drawPencil(x, y);
			break;

		case RECTANGLE:
			drawRectangle(x, y);
			break;

		case OVAL:
			drawOval(x, y);
			break;

		default:
			break;
		}
	}

	private void drawOval(int x, int y) {
		if (refPoint == null) {
			refPoint = new Point(x, y);
		} else {
			int diffX = (int) refPoint.getX() - x;
			int diffY = (int) refPoint.getY() - y;
			canvasPanel.getGraphics().drawOval(x, y, Math.abs(diffX), Math.abs(diffY));
			refPoint = null;
		}
	}

	private void drawRectangle(int x, int y) {
		if (refPoint == null) {
			refPoint = new Point(x, y);
		} else {
			int diffX = (int) refPoint.getX() - x;
			int diffY = (int) refPoint.getY() - y;
			canvasPanel.getGraphics().drawRect(x, y, Math.abs(diffX), Math.abs(diffY));
			refPoint = null;
		}
	}

	private void drawPencil(int x, int y) {
		canvasPanel.getGraphics().drawLine(x, y, x, y);
	}

	private void setFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void setComponents() {
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		menuPanel = new JPanel();
		menuPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(menuPanel, BorderLayout.NORTH);
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		canvasPanel = new JPanel();
		canvasPanel.setBackground(Color.CYAN);
		frame.getContentPane().add(canvasPanel, BorderLayout.CENTER);
	}

	private void setMenu() {
		JLabel pencilLabel = new JLabel(new ImageIcon(ICONSBASE + ICONPENCILAPTH));
		menuPanel.add(pencilLabel);

		JLabel rectangleLAbel = new JLabel(new ImageIcon(ICONSBASE + ICONRECT));
		menuPanel.add(rectangleLAbel);

		JLabel ovalLAbel = new JLabel(new ImageIcon(ICONSBASE + ICONOVAL));
		menuPanel.add(ovalLAbel);

		JLabel discardLabel = new JLabel(new ImageIcon(ICONSBASE + ICONDISCARD));
		menuPanel.add(discardLabel);

		setMenuListeners(pencilLabel, discardLabel, rectangleLAbel, ovalLAbel);
	}

	private void setMenuListeners(JLabel pencilLabel, JLabel discardLabel, JLabel rectangleLAbel, JLabel ovalLAbel) {
		pencilLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				drawMode = DrawingMode.PENCIL;
			}
		});

		discardLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				resetCanvas();
			}
		});

		rectangleLAbel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				drawMode = DrawingMode.RECTANGLE;
			}
		});

		ovalLAbel.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				drawMode = DrawingMode.OVAL;
			}
		});

	}

	private void resetCanvas() {
		this.canvasPanel.setBackground(Color.CYAN);
		this.canvasPanel.repaint();
	}

}
