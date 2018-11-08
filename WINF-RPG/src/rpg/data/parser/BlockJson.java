package rpg.data.parser;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BlockJson {
	//hier sind ALLE blocks drinne als array gesspeichert (parentws class)
	private String nr;
	private String src;
	private boolean coll;

	private BufferedImage texture;
	private String AppdataPath;
	public BlockJson() {
		AppdataPath = System.getProperty("user.home") + "/.RPGGame";
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = AppdataPath + src;
	}

	public boolean isColl() {
		return coll;
	}

	public void setColl(boolean coll) {
		this.coll = coll;

	}

	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture() {
		try {
			this.texture = ImageIO.read(new File(src));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
