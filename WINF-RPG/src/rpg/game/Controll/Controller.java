package rpg.game.Controll;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import rpg.game.Game;

public class Controller extends Thread implements KeyListener{
	public Controller() {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_F12) {
			Game.map.load(2);
			System.out.println("Button has been pressed");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void run() {
		
	}
	

}
