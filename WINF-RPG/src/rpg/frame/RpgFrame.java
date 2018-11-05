package rpg.frame;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

import rpg.game.Game;
import rpg.menue.panel.MenuePanel;
import setup.Loopie;

public class RpgFrame extends JFrame {
	public static int SCREEN_WIDTH;
	public static int SCREEN_HEIGHT;
	
	
	public MenuePanel mp;
	public Game game;
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public RpgFrame(Dimension dimension,Game game) {	//RPGFrame nimmt gleich die beiden instanzen mit so braucht man keine static variablen
		// Listiner für resizing
		SCREEN_WIDTH = (int) dimension.getWidth();
		SCREEN_HEIGHT = (int) dimension.getHeight();
		this.game = game;
		mp = new MenuePanel();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(SCREEN_WIDTH/2-Loopie.GAME_WIDTH/2, SCREEN_HEIGHT/2-Loopie.GAME_HEIGHT/2,Loopie.GAME_WIDTH, Loopie.GAME_HEIGHT);
		
		setContentPane(game.getPanel());
		/*
		 * Die Titel bar nimmt noch platz weg der return wert ist aber 0 bei allen 4 werten
		 * 
		 * 		System.out.println(this.getInsets());
		 */
	}

	public Container getPanel() {
		return this.getContentPane();
	}

}
