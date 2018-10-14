package rpg.menue.panel;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MenuePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MenuePanel() {
		setLayout(null);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setBounds(68, 12, 829, 403);
		add(btnStartGame);

	}

}
