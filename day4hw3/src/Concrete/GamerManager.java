package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {
	
	IGamerCheckService gamerCheck ;
	
	

	public GamerManager(IGamerCheckService gamerCheck) {
		
		this.gamerCheck = gamerCheck;
	}

	@Override
	public void add(Gamer gamer) {
		if(this.gamerCheck.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+gamer.getLastName()+" veritaban�na eklendi");
		}else {
			System.out.println("Kullan�c� bilgileri hatal�");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" veritaban�ndan silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" bilgileri veritaban�nda g�ncellendi");
	}

}
