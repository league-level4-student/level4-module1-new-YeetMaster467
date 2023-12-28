package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseFollowMorph extends Polymorph implements MouseMotionListener {

	public MouseFollowMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		setX(e.getX());
		setY(e.getY());
	}

}
