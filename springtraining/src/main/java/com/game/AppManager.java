package com.game;

public class AppManager {

	public static void main(String[] args) {
//		Wresting wrs = new Wresting();
//		GameManager gamer = new GameManager(wrs);
//		gamer.play();
//	    Shooter sh = new Shooter();
//	    gamer = new GameManager(sh);
//		gamer.play();
//		gamer.up();
		GameConsole shoot = new Shooter();
		GameManager gamer = new GameManager(shoot);
		gamer.play();
		GameConsole wrs = new Wresting();
		GameManager gamer2 = new GameManager(wrs);
		gamer2.play();
		GameConsole racer = new Racing();
		GameManager gamer3 = new GameManager(racer);
		gamer3.play();
		
	}

}
