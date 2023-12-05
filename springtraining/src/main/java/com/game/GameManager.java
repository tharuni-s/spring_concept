package com.game;

public class GameManager {
	
//	Wresting w;
//	Shooter s;
//	GameManager(Wresting w){
//		this.w = w;
//		
//	}
//	GameManager(Shooter s){
//		this.s = s;
//		
//	}
	GameConsole game;
	
	GameManager(GameConsole game)
	{
		
		this.game=game;
	}
	void play()
	{
		System.out.println("Game invoked"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	void up()
	{
		System.out.println("reload");
	}

}
