package rpg.game;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import rpg.data.parser.MainParser;

public class GameGrid extends JPanel {

	private static final long serialVersionUID = 1L;

	private Dimension cellSize;
	private final int res = 64;

	private int respx;
	private int respy;
	

	public GameGrid(int WIDTH, int HEIGHT) {

		respx = WIDTH / res;
		respy = HEIGHT / res; // Die title bar nimmt platz weg , beträgt ungefährt 1
		

		System.out.println("GamegridSize:" + respx + "x" + respy);
		System.out.println(deltaMapX(-64));

		cellSize = new Dimension(res, res);

	}

	public void draw(Graphics g) {

		int[][] map = Game.map.getMap();
		/*
		 * Der +2 wer im loop sorgt für eine art "Rahmen" um das ganze geschehen die +1
		 * in den Translate funktionen sorgt dafür das es auf beiden seiten ist :)
		 */
		for (int x = 0; x < respx + 2; x++) {
			for (int y = 0; y < respy + 2; y++) {
				g.drawImage(Game.blocks[map[y+1 + deltaMapY(Game.dy)][x+1+deltaMapX(Game.dx)]].getTexture(),
						translateX(x - 1) + Game.dx, translateY(y - 1) + Game.dy, null); // aus einem mir nicht
																							// bekannten grund ist
																							// map[x][y] vertauscht aber
																							// so lange es geht :D
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

	public int deltaMapX(int dx) {
		int du;
		du = (dx - dx % res)/res;
		return du;
	}

	public int deltaMapY(int dy) {
		int du;
		du = (dy - dy % res)/res;
		return du;
	}
}
