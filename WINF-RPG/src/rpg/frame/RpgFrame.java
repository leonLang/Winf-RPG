package rpg.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import rpg.menue.panel.MenuePanel;

public class RpgFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public RpgFrame() {
		MenuePanel mp = new MenuePanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		setContentPane(mp);
	}

}
