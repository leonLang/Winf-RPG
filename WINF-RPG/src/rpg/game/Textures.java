package rpg.game;

import rpg.data.parser.MainParser;

public class Textures {
	private MainParser parser;
	public Textures() {
		parser = new MainParser();
		parser.loadBlocks();
	}
	public void load() {
		//init textreData
		String[] preload = Game.map.getJsonMap().getPreload();
		for(int i = 0;i < preload.length;i++) {
			int preloadint = Integer.parseInt(preload[i], 16);
			Game.blocks[preloadint].setTexture();
		}
	}
}
