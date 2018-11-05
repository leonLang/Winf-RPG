package rpg.game;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {


	private int WIDTH;
	private int HEIGHT;

	private GameGrid background;

	public GamePanel(int WIDTH, int HEIGHT) {
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;

		background = new GameGrid(WIDTH, HEIGHT);
		this.add(background);
		setLayout(null);

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		background.draw(g); // draw background
	}

}
