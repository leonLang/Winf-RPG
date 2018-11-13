package setup;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Timer;

import rpg.frame.RpgFrame;
import rpg.game.Game;
import rpg.game.GamePanel;
import rpg.network.client.ServerConnector;
import sound.Sound;

public class Loopie implements Runnable{
	public static final int GAME_WIDTH = 1216;
	public static final int GAME_HEIGHT = 864;
	
	
	public static final int FPS = 60;
	public static final long maxLoopTime = 1000 / FPS;

	public boolean running = true;
	
	public ServerConnector client;
	public RpgFrame frame;
	public Game game;
	
	Timer timer;

	@Override
	public void run() {
		long timestamp;
		long oldTimestamp;
		setup();

		while (running) {
			oldTimestamp = System.currentTimeMillis();
			update();
			timestamp = System.currentTimeMillis();
			if (timestamp - oldTimestamp > maxLoopTime) {
				continue;
			}
			render();
			timestamp = System.currentTimeMillis();
			if (timestamp - oldTimestamp <= maxLoopTime) {
				try {
					Thread.sleep(maxLoopTime - (timestamp - oldTimestamp));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	void update() {
		game.controll.update();
		game.getPanel().debug.DebugUpdate();
	}

	void render() {
		Toolkit.getDefaultToolkit();
		frame.repaint();
	}

	void setup() {
		getScreenSize();
		client = new ServerConnector();
		client.start();
		//Instanzen werden schon erstellt
		game = new Game(GAME_WIDTH,GAME_HEIGHT);
		
		frame = new RpgFrame(getScreenSize(),game);
		frame.setVisible(true);
	}
	Dimension getScreenSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}