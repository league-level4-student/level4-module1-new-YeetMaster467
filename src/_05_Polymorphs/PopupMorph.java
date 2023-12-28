package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class PopupMorph extends Polymorph implements MouseListener {

	public PopupMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getX() > getWidth() && e.getX() < getWidth() + 50 && e.getY() > getHeight() && e.getY() < getHeight() + 50) {
			JOptionPane.showMessageDialog(null, "Yo wassup");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

}
