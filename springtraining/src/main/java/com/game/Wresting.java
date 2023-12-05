package com.game;

public class Wresting implements GameConsole{
	public String toString()
	{
		return "wrestling";
	}
	public void up()
	{
		System.out.println("push");
	}
	public void down()
	{
		System.out.println("dodge");
	}
	public void left()
	{
		System.out.println("punch");
	}
	public void right()
	{
		System.out.println("kick");
	}

}
