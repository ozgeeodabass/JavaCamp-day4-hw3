package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " veritabanına eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" veritabanından silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" veritabanında güncellendi");
		
	}

	@Override
	public void addMultiple(Game[] game) {
		for (Game game2 : game) {
			add(game2);
		}
		
	}

	
		
	}
 

