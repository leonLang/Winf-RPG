package rpg.game;

import java.awt.Dimension;
import java.io.IOException;

import rpg.data.parser.MainParser;
import rpg.data.parser.MapJson;

public class Map {
	private Dimension TopLeft;
	private MainParser parser;
	private MapJson map;
	private int[][] mapData;

	public Map() {
		parser = new MainParser();
		TopLeft = new Dimension(32, 32);
	}

	public void load(int nr) {
		parser.loadMap(nr);
		map = parser.map;
		mapData = ConvertMapData(map.getMap());
	}

	public Dimension getTopLeft() {
		return TopLeft;
	}

	public int getx() {
		return map.getX();
	}

	public int gety() {
		return map.getY();
	}

	public int[][] ConvertMapData(String[][] raw) {
		int x = map.getX();
		int y = map.getY();
		int[][] data = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int u = 0; u < y; u++) {
				try {
					data[i][u] = Integer.parseInt(raw[i][u], 16);
				} catch (Exception e) {
					data[i][u] = 0;

				}
			}
		}
		return data;
	}
	public int[][] getMap() {
		return mapData;
	}
	public MapJson getJsonMap() {
		return map;
	}
}
