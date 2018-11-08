package rpg.data.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import rpg.game.Game;

public class MainParser  {
	
	public MapJson map;
	private String AppdataPath;
	
	public MainParser() {
		AppdataPath = System.getProperty("user.home") + "/.RPGGame";
	}

	public void loadBlocks() {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get(AppdataPath + "/assats/blocks/block.json"));
			ObjectMapper objectMapper = new ObjectMapper();
			Game.blocks = objectMapper.readValue(jsonData, BlockJson[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void loadMap() {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get(AppdataPath + "/assats/maps/map1.json"));
			ObjectMapper objectMapper = new ObjectMapper();
			map = objectMapper.readValue(jsonData, MapJson.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public MapJson getMap() {
		return map;
	}
}
