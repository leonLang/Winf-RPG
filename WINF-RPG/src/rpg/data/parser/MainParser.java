package rpg.data.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainParser extends Thread {
	
	MapJson map;
	
	public MainParser() {
	}

	public void load() {
		
	}
	public void start() {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("map1.json"));
			ObjectMapper objectMapper = new ObjectMapper();
			map = objectMapper.readValue(jsonData, MapJson.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
