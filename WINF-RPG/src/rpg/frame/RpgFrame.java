package rpg.frame;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

import rpg.game.GamePanel;
import rpg.menue.panel.MenuePanel;

public class RpgFrame extends JFrame {
	public static int SCREEN_WIDTH;
	public static int SCREEN_HEIGHT;
	
	public static final int GAME_WIDTH = 1216;
	public static final int GAME_HEIGHT = 864;
	
	public MenuePanel mp;
	public GamePanel gp;
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public RpgFrame(Dimension dimension) {
		// Listiner für resizing
		SCREEN_WIDTH = (int) dimension.getWidth();
		SCREEN_HEIGHT = (int) dimension.getHeight();
		
		mp = new MenuePanel();
		gp = new GamePanel(GAME_WIDTH,GAME_HEIGHT);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(SCREEN_WIDTH/2-GAME_WIDTH/2, SCREEN_HEIGHT/2-GAME_HEIGHT/2,GAME_WIDTH, GAME_HEIGHT);
		
		setContentPane(gp);
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
