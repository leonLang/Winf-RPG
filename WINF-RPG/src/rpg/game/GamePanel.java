package rpg.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import rpg.game.debug.DebugWindow;
import rpg.game.player.Player;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GameGrid background;
	private Player player;
	public DebugWindow debug;

	public GamePanel(int WIDTH, int HEIGHT) {

		background = new GameGrid(WIDTH, HEIGHT);
		player = new Player(WIDTH,HEIGHT);
		debug = new DebugWindow(WIDTH,HEIGHT);
		
		this.add(debug);
		this.add(background);
		this.add(player);
		this.setOpaque(true);
		this.setBackground(Color.black);
		setLayout(null);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		background.draw(g); // draw background
		// For Controller
		this.setFocusable(true);
		this.requestFocusInWindow();
	}

	public GameGrid getbackground() {
		return background;
	}

}
