package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {
	int i = 0;

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
		// System.out.println("update");
		int newX = (int) (getX() + Math.sin(i) * 150);
		setX(newX);
		int newY = (int) (getY() + Math.cos(i) * 150);
		setY(newY);
		i++;
	}
}
