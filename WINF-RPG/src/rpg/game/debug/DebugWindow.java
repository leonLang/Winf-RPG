package rpg.game.debug;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import rpg.game.Game;
import setup.Loopie;

public class DebugWindow extends JPanel {
	private static final long serialVersionUID = 1L;
	private float x;
	private float y;
	JLabel Lx, Ly;
	public static boolean vis;

	public DebugWindow(int WIDTH, int HEIGHT) {
		vis = false;
		x = Game.dx / 64 + Loopie.GAME_WIDTH / 2;
		y = Game.dy / 64 + Loopie.GAME_HEIGHT / 2;
		Lx = new JLabel("X: " + x);
		Ly = new JLabel("Y: " + y);
		LabelProperties(Lx);
		LabelProperties(Ly);

		this.setBounds(0, 0, WIDTH, HEIGHT);
		this.setVisible(vis);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(Lx);
		this.add(Ly);
		this.setOpaque(false);
	}

	public void DebugUpdate() {
		x = -(Game.dx / 64 - Loopie.GAME_WIDTH / 128);
		y = -(Game.dy / 64 - Loopie.GAME_HEIGHT / 128);

		Lx.setText("X: " + x);
		Ly.setText("Y: " + y);
		
		this.setVisible(vis);
	}

	private void LabelProperties(JLabel label) {
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	}

	public static void visibility() {
		if (vis) {
			vis = false;
		} else {
			vis = true;
		}
	}
}
