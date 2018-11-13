package rpg.game.player;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import rpg.game.GameGrid;

public class Player extends JLabel {

	private static final long serialVersionUID = 1L;

	private Icon icon;
	private int posx;
	private int posy;

	public static final int Width = 32;
	public static final int Height = 32;

	public Player(int WIDTH, int HEIGHT) {

		this.posx = WIDTH / 2;
		this.posy = HEIGHT / 2;

		this.setSize(Width, Height);
		icon = new ImageIcon("C:\\Users\\tromp\\.RPGGame\\assats\\textures\\red.png");
		this.setIcon(icon);
		this.setLocation(posx, posy);
	}

	public void draw() {

	}
}
