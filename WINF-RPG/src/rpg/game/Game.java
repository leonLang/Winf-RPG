package rpg.game;

import rpg.game.Controll.Controller;

public class Game {
	
	public Controller controll;
	
	private GamePanel gamepanel;
	
	private MapBlock[][] blocks;
	
	public Game(int WIDTH, int HEIGHT) {
		//initialisiere GameComponents
		blocks = new MapBlock[32][32];
		controll = new Controller();
		gamepanel = new GamePanel(WIDTH,HEIGHT);
		
		gamepanel.addKeyListener(controll);
	}
	public GamePanel getPanel() {
		return gamepanel;
	}
	public void loadMap() {
		
	}
}
