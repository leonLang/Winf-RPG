package rpg.game;

import rpg.data.parser.BlockJson;
import rpg.data.parser.MainParser;
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
		//Delta werte initialisieren
		// initialisiere GameComponents
		controll = new Controller();
		gamepanel = new GamePanel(WIDTH, HEIGHT);

		gamepanel.addKeyListener(controll);

		map = new Map();
		map.load(1); // 1.LoadMap

		textures = new Textures(); // Konstruktor l�d alle texturen :)
		textures.load(); // 2.LoadTextures

	}

	public GamePanel getPanel() {
		return gamepanel;
	}
}
