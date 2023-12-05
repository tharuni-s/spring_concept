package com.game;

public class Racing implements GameConsole {
	public String toString()
	{
		return "Racer";
	}
	public void up()
	{
		System.out.println("accelerate");
	}
	public void down()
	{
		System.out.println("slow");
	}
	public void left()
	{
		System.out.println("move left");
	}
	public void right()
	{
		System.out.println("move right");
	}

}
