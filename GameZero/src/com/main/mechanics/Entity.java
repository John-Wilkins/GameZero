package com.main.mechanics;

public class Entity
{
	public Location loc;
	
	public Entity(Location loc)
	{
		this.loc = loc;
	}
	
	//Getters and Setters
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
}