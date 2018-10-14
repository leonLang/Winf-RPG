package rpg.game.panel;

import javax.swing.JPanel;

public class GamePanel extends JPanel {


	public GamePanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1000, 600);
		add(panel);

	}

}
