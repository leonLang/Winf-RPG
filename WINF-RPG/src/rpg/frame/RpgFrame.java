package rpg.frame;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import rpg.game.panel.GamePanel;
import rpg.menue.panel.MenuePanel;

public class RpgFrame extends JFrame {
	public static int SCREEN_WIDTH;
	public static int SCREEN_HEIGHT;
	
	public MenuePanel mp;
	public GamePanel gp;
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public RpgFrame(Dimension dimension) {
		SCREEN_WIDTH = (int) dimension.getWidth();
		SCREEN_HEIGHT = (int) dimension.getHeight();
		mp = new MenuePanel();
		gp = new GamePanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(SCREEN_WIDTH/4, SCREEN_HEIGHT/4, SCREEN_WIDTH/2, SCREEN_HEIGHT/2);
		setContentPane(gp);
		gp.start();
	}

}
