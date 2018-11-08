package rpg.game;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import rpg.data.parser.MainParser;

public class GameGrid extends JPanel {

	private static final long serialVersionUID = 1L;

	Dimension cellSize;

	private int respx;
	private int respy;

	public GameGrid(int WIDTH, int HEIGHT) {

		respx = WIDTH/32;
		respy = HEIGHT/32-1;	//Die title bar nimmt platz weg , beträgt ungefährt 1
		
		cellSize = new Dimension(32, 32);

	}

	public void draw(Graphics g) {
		
		int[][] map = Game.map.getMap();
		for (int x = 0; x < respx; x++) {
			for (int y = 0; y < respy; y++) {
			
				g.drawRect(translateX(x), translateY(y), (int) cellSize.getWidth(), (int) cellSize.getHeight());	//provisorisch
				//int mx = Game.map.getx(); ---> ist repsx bzw. respy
				//int my = Game.map.gety();
				//MainParser.blocks[map[x][y]].getTexture();
				g.drawImage(Game.blocks[map[x][y]].getTexture(),translateX(x), translateY(y), (int) cellSize.getWidth(), (int) cellSize.getHeight(), null);
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
