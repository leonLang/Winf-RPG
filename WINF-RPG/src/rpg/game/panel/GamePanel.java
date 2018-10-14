package rpg.game.panel;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	public int x;

	public GamePanel() {
		setLayout(null);
		
		setBounds(0, 0, 1000, 600);

	}
	protected void paintComponent(Graphics g) {
		Toolkit.getDefaultToolkit();
		super.paintComponent(g);
		g.drawRect(x, 100, 100, 100);
	}

}
