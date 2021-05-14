package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " veritabanýna eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" veritabanýndan silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" veritabanýnda güncellendi");
		
	}

	@Override
	public void addMultiple(Game[] game) {
		for (Game game2 : game) {
			add(game2);
		}
		
	}

	
		
	}
 

