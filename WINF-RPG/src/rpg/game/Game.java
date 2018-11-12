package rpg.game;

import rpg.data.parser.BlockJson;
import rpg.game.Controll.Controller;

public class Game {

	public Controller controll;

	private GamePanel gamepanel;

	public static Map map;
	public static Textures textures;
	public static BlockJson[] blocks;

	public static int dx;
	public static int dy;

	public Game(int WIDTH, int HEIGHT) {
		dx = 0;
		dy = 0;
		// Delta werte initialisieren
		// initialisiere GameComponents
		controll = new Controller();
		gamepanel = new GamePanel(WIDTH, HEIGHT);

		gamepanel.addKeyListener(controll);

		map = new Map();
		map.load(2); // 1.LoadMap

		textures = new Textures(); // Konstruktor läd alle texturen :)
		textures.load(); // 2.LoadTextures
	}

	public GamePanel getPanel() {
		return gamepanel;
	}

	public void setdx(int u) {
		dx = -u * GameGrid.res;
	}

	public void setdy(int u) {
		dy = -u * GameGrid.res;
	}
}
