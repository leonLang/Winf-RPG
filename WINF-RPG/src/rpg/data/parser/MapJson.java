package rpg.data.parser;

public class MapJson {
	String[][] map;
	String[] preload;
	String name;
	int x;
	int y;
	
	public String[] getPreload() {
		return preload;
	}
	public void setPreload(String[] preload) {
		this.preload = preload;
	}
	public String[][] getMap() {
		return map;
	}
	public void setMap(String[][] map) {
		this.map = map;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
