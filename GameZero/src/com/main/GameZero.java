package com.main;

import java.awt.BorderLayout;
import java.awt.Canvas;

import javax.swing.JFrame;

import com.main.controls.InputListener;

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
		startMenu.setFocusable(true);
		Canvas canvas = new Canvas();
		canvas.setFocusable(true);
		InputListener listener = new InputListener();
		canvas.addKeyListener(listener);
		canvas.addMouseListener(listener);
		canvas.addMouseMotionListener(listener);
		canvas.addMouseWheelListener(listener);
		startMenu.add(canvas, BorderLayout.CENTER);
		startMenu.setVisible(true);
	}
}