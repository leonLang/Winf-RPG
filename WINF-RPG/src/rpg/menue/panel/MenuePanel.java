package rpg.menue.panel;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MenuePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MenuePanel() {
		setLayout(null);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setBounds(68, 12, 829, 403);
		add(btnStartGame);

	}

}
