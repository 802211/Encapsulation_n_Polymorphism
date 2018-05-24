package _03_polymorphs;

import java.awt.Color;
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

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> array = new ArrayList<Polymorph>();

	public void addToArray() {

		array.add(new BluePolymorph(0, 0, WIDTH, HEIGHT));
		array.add(new RedMorph(50, 50, WIDTH, HEIGHT));
		array.add(new MovingMorph(100, 100, WIDTH, HEIGHT));
		array.add(new BluePolymorph(150, 150, WIDTH, HEIGHT));
		array.add(new RedMorph(200, 200, WIDTH, HEIGHT));
		array.add(new MovingMorph(250, 250, WIDTH, HEIGHT));
		array.add(new BluePolymorph(300, 300, WIDTH, HEIGHT));
		array.add(new RedMorph(350, 350, WIDTH, HEIGHT));
		array.add(new MovingMorph(400, 400, WIDTH, HEIGHT));
	}

	public void drawUpdate() {
		for (Polymorph p : array) {
			p.draw(g); // /// // !!!FIX!!! \\ \\\ \\
			p.update();
		}
	}

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
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
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 50, 50);

		// draw polymorph

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
