package rpg.game;

import java.awt.Dimension;
import java.io.IOException;

import rpg.data.parser.MainParser;

public class Map {
	private Dimension TopLeft;
	private MainParser parser;

	public Map() {
		parser = new MainParser();
		TopLeft = new Dimension(32, 32);
	}

	public void load() {
		parser.load();
		parser.start();
	}

	public Dimension getTopLeft() {
		return TopLeft;
	}
}
