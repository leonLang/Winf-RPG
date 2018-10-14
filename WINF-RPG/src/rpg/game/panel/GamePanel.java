package rpg.game.panel;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {


	public GamePanel() {
		setLayout(null);
		
		setBounds(0, 0, 1000, 600);

	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100, 100, 100);
	}

}
