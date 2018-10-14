package setup;

import java.io.IOException;

import rpg.data.parser.MainParser;
import rpg.frame.RpgFrame;
import rpg.network.client.ServerConnector;

public class Loopie implements Runnable {
	public static final int FPS = 60;
	public static final long maxLoopTime = 1000 / FPS;

	public boolean running = true;
	
	public ServerConnector client;
	public RpgFrame frame;

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

	}

	void render() {
		frame.repaint();
	}

	void setup() {
		try {
		//	client = new ServerConnector();
			new MainParser();
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame = new RpgFrame();
		frame.setVisible(true);
	}
}