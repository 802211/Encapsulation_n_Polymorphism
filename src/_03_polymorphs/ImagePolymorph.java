package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph {
	static BufferedImage cat;

	ImagePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			cat = ImageIO.read(this.getClass().getResourceAsStream("Cat.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(cat, getX(), getY(), getWidth(), getHeight(), null);
		// g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {

	}
}
