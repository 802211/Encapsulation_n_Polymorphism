package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {
	public CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {

		setX((int) Math.sin(360));
		setY((int) Math.cos(360));

	}
}
