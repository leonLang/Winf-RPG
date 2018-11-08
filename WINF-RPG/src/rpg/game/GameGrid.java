package rpg.game;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import rpg.data.parser.MainParser;

public class GameGrid extends JPanel {

	private static final long serialVersionUID = 1L;

	private Dimension cellSize;

	private int respx;
	private int respy;

	public GameGrid(int WIDTH, int HEIGHT) {

		respx = WIDTH / 32;		 
		respy = HEIGHT / 32 - 1; // Die title bar nimmt platz weg , beträgt ungefährt 1

		System.out.println("GamegridSize:" + respx + "x" + respy);
		
		cellSize = new Dimension(32, 32);

	}

	public void draw(Graphics g) {

		int[][] map = Game.map.getMap();

		for (int x = 0; x < respx; x++) {
			for (int y = 0; y < respy; y++) {

				// int mx = Game.map.getx(); ---> ist repsx bzw. respy
				// int my = Game.map.gety();
				// MainParser.blocks[map[x][y]].getTexture();
				g.drawImage(Game.blocks[map[y][x]].getTexture(), translateX(x), translateY(y), null);	//aus einem mir nicht bekannten grund ist map[x][y] vertauscht aber so lange es geht :D
			}
		}
	}

	public int translateX(int x) {
		int dx;
		dx = (int) cellSize.getWidth() * x;
		return dx;

	}

	public int translateY(int y) {
		int dy;
		dy = (int) cellSize.getHeight() * y;
		return dy;

	}
}
