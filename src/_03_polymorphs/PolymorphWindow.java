package _03_polymorphs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {

	public static final int WIDTH = 60;
	public static final int HEIGHT = 60;
	public static final int catW = 90;
	public static final int catH = 60;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> array = new ArrayList<Polymorph>();

	public void addToArray() {
		// System.out.println("test2");
		array.add(new BluePolymorph(0, 0, WIDTH, HEIGHT));
		array.add(new RedMorph(50, 50, WIDTH, HEIGHT));
		array.add(new MovingMorph(100, 100, WIDTH, HEIGHT));
		array.add(new CirclePolymorph(300, 300, WIDTH, HEIGHT));
		FollowMousePolymorph FMP = new FollowMousePolymorph(200, 200, WIDTH, HEIGHT);
		window.addMouseMotionListener(FMP);
		array.add(FMP);
		array.add(new ImagePolymorph(250, 250, catW, catH));
		array.add(new BluePolymorph(150, 150, WIDTH, HEIGHT));
		array.add(new RedMorph(350, 350, WIDTH, HEIGHT));
		array.add(new MovingMorph(400, 400, WIDTH, HEIGHT));
	}

	public static void main(String[] args) {
		PolymorphWindow PolyWind = new PolymorphWindow();
		PolyWind.buildWindow();
		PolyWind.addToArray();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		// g.setColor(Color.LIGHT_GRAY);
		// g.fillRect(0, 0, 50, 50);
		// System.out.println("test");
		// draw polymorph
		for (Polymorph p : array) {
			// System.out.println("test");
			p.draw(g);
			p.update();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
