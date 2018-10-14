package rpg.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import rpg.game.panel.GamePanel;
import rpg.menue.panel.MenuePanel;

public class RpgFrame extends JFrame {
	
	public MenuePanel mp;
	public GamePanel gp;
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public RpgFrame() {
		mp = new MenuePanel();
		gp = new GamePanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		setContentPane(gp);
	}

}
