package rpg.game;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GameGrid background;

	public GamePanel(int WIDTH, int HEIGHT) {

		background = new GameGrid(WIDTH, HEIGHT);
		this.add(background);
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
