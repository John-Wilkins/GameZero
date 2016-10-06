package com.main.mechanics;

import com.main.controls.Input;

public class Player extends Entity
{
	//Testing - Evan Meade
	public int health;
	public int speed;
	public int damage;
	public int rangedDamage;
	public boolean isHuman;
	
	public Player (int health, int speed, int damage, int rangedDamage, boolean isHuman, Location loc)
	{
		super(loc);
		this.health = health;
		this.speed = speed;
		this.damage = damage;
		this.rangedDamage = rangedDamage;
		this.isHuman = isHuman;
	}
	
	//Called every physics tick
	public void act(Input input)
	{
		
	}

	//Getters and Setters
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getRangedDamage() {
		return rangedDamage;
	}

	public void setRangedDamage(int rangedDamage) {
		this.rangedDamage = rangedDamage;
	}

	public boolean isHuman() {
		return isHuman;
	}

	public void setHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}
}