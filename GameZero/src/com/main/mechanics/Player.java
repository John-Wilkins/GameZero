package com.main.mechanics;

public class Player implements Entity
{
	public int health;
	public int speed;
	public int damage;
	public int rangedDamage;
	
	public Player(int playerHealth, int playerSpeed, int playerDamage, int playerDamageRanged) {
		health = playerHealth;
		speed = playerSpeed;
		damage = playerDamage;
		rangedDamage = playerDamageRanged;
	}
}