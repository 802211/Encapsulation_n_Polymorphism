package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MessagePolymorph extends Polymorph {
	public MessagePolymorph(int x, int y, int width, int height) {
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

	}
}
