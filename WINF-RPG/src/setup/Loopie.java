package setup;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;

import rpg.data.parser.MainParser;
import rpg.frame.RpgFrame;
import rpg.network.client.ServerConnector;

public class Loopie implements Runnable, ActionListener{
	public static final int FPS = 60;
	public static final long maxLoopTime = 1000 / FPS;

	public boolean running = true;
	
	public ServerConnector client;
	public RpgFrame frame;
	
	Timer timer;

	@Override
	public void run() {
		timer = new Timer(20,this);
		long timestamp;
		long oldTimestamp;
		setup();
		timer.setInitialDelay(0);
		timer.start();
		/*while (running) {
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
		}*/
	}

	void update() {
		frame.gp.x += 10;

	}

	void render() {
		frame.repaint();
	}

	void setup() {
		getScreenSize();
		try {
		//	client = new ServerConnector();
			new MainParser();
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame = new RpgFrame();
		frame.setVisible(true);
	}
	void getScreenSize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		long timestamp;
		long oldTimestamp;
		oldTimestamp = System.currentTimeMillis();
		update();
		timestamp = System.currentTimeMillis();
		if (timestamp - oldTimestamp > maxLoopTime) {
			
		}
		render();
		timestamp = System.currentTimeMillis();
		if (timestamp - oldTimestamp <= maxLoopTime) {
			try {
				Thread.sleep(maxLoopTime - (timestamp - oldTimestamp));
			} catch (InterruptedException ee) {
				ee.printStackTrace();
			}
		}
		timer.restart();
		
	}
}