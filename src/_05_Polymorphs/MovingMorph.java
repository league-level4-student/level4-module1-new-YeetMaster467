package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	
	Random r = new Random();
	
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		if (getX() < 500 || getY() < 500) {
			setX(getX() + r.nextInt(5));
			setY(getY() + r.nextInt(5));
		} else {
			setX(0);
			setY(0);
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}
