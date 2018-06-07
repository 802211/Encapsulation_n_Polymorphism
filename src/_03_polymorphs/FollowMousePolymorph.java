package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowMousePolymorph extends Polymorph implements MouseMotionListener {
	int mx = 0;
	int my = 0;

	public FollowMousePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		setX(mx - 35);
		setY(my - 35);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("getX = " + e.getX());
		// System.out.println("getY = " + e.getY());
		mx = e.getX();
		my = e.getY();
		// setY(e.getY());

	}

}
