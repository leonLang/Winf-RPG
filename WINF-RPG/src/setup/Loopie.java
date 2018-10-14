package setup;

import java.io.IOException;

import rpg.data.parser.MainParser;
import rpg.frame.RpgFrame;
import rpg.network.client.ServerConnector;

public class Loopie implements Runnable {
	public static final int FPS = 60;
	public static final long maxLoopTime = 1000 / FPS;

	public boolean running = true;

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

	}

	void setup() {
		try {
			ServerConnector client = new ServerConnector();
			new MainParser();
		} catch (IOException e) {
			e.printStackTrace();
		}
		RpgFrame frame = new RpgFrame();
		frame.setVisible(true);
	}
}