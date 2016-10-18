package com.main.mechanics;

public class Vector
{
	public double deltaX;
	public double deltaY;
	
	public Vector(double deltaX, double deltaY)
	{
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}

	public double getDeltaX() 
	{
		return deltaX;
	}

	public void setDeltaX(double deltaX) 
	{
		this.deltaX = deltaX;
	}

	public double getDeltaY() 
	{
		return deltaY;
	}

	public void setDeltaY(double deltaY) 
	{
		this.deltaY = deltaY;
	}
}