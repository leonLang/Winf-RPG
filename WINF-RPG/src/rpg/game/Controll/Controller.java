package rpg.game.Controll;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import rpg.game.Game;
import rpg.game.GameGrid;

public class Controller extends Thread implements KeyListener {
	private boolean up, down, right, left;
	private final int c = 10;

	public Controller() {
		up = false;
		down = false;
		right = false;
		left = false;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_F12) {
			Game.map.load(2);
		}
		if (e.getKeyCode() == KeyEvent.VK_F11) {
			GameGrid.test++;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			left = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			left = false;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void run() {

	}

	public void update() {
		if (up) {
			Game.dy += c;
		} else if (down) {
			Game.dy -= c;
		}
		if (right) {
			Game.dx -=c;
		} else if (left) {
			Game.dx +=c;
		}

	}

}
