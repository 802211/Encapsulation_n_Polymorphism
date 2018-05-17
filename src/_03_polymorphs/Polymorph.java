package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	// int x;
	// int y;

	private int x;
	private int y;
	private int width;
	private int height;

	public int getX() {
		return x;
	}

	public void setX(int x) {

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {

	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {

	}
	
	public Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}


