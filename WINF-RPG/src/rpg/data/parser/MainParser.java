package rpg.data.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainParser {
	public MainParser() throws IOException {
		byte[] jsonData = Files.readAllBytes(Paths.get("map1.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		MapJson map = objectMapper.readValue(jsonData, MapJson.class);
	}
}
