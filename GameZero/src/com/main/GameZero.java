package com.main;

import javax.swing.JFrame;

public class GameZero
{
	public long time;
	private int width;
	private int height;

	public static void main(String[] args)
	{
		//Set up Start Menu
		JFrame startMenu = new JFrame();
		startMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startMenu.setSize(600, 400);
		startMenu.setResizable(false);
		startMenu.setLocationRelativeTo(null);
		startMenu.setUndecorated(true);
		startMenu.setVisible(true);
	}
}