package com.game;

public class Shooter implements GameConsole {
	public String toString()
	{
		return "shooter";
	}

	public void up()
	{
		System.out.println("reload");
	}
	public void down()
	{
		System.out.println("change weapon");
	}
	public void left()
	{
		System.out.println("aim");
	}
	public void right()
	{
		System.out.println("shoot");
	}
}
