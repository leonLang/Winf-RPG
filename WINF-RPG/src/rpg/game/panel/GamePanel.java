package rpg.game.panel;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GamePanel extends JPanel {

	public int x;
	private Dimension GridSize;

	public GamePanel() {
		setLayout(null);
		setBounds(0, 0, 1000, 600);


	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(1000/2-50, 600/2-50 + x, 100, 100);
	}
	public Dimension SizeTransformer(Dimension ScreenSize) {
		Dimension SquareSize = new Dimension(32,32);
		double x = ScreenSize.getWidth()/SquareSize.getWidth();
		double y = ScreenSize.getHeight()/SquareSize.getHeight();
		Dimension dimension = new Dimension();
		
		dimension.setSize(x, y);
		return dimension;
		
	}
	public void start() {
		GridSize = SizeTransformer(SwingUtilities.getRoot(this).getSize());
		System.out.println(GridSize);
	}
	public void draw() {
		
	}

}
