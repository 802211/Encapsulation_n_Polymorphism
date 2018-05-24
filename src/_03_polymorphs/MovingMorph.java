package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	int g = 0;

	public void update() {
		this.setX(g++);
		this.setY(g++);

	}
}
