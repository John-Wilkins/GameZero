package com.main.mechanics;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Entity
{
	public Location loc;
	public Vector vec;
	public ArrayList<Integer> image = new ArrayList<Integer>();
	
	public Entity(Location loc, Vector vec, BufferedImage image)
	{
		this.loc = loc;
		this.vec = vec;
		for(int x = 0; x< image.getWidth(); x++)
			for(int y = 0; y < image.getHeight(); y++)
				this.image.add(image.getRGB(x, y));
	}
	
	//Getters and Setters
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public Vector getVec() {
		return vec;
	}

	public void setVec(Vector vec) {
		this.vec = vec;
	}
	public ArrayList<Integer> getImage() {
		return image;
	}

	public void setImage(ArrayList<Integer> image) {
		this.image = image;
	}
}