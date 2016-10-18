package com.main.mechanics;

public class Entity
{
	public Location loc;
	public Vector vec;
	
	public Entity(Location loc, Vector vec)
	{
		this.loc = loc;
		this.vec = vec;
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
}