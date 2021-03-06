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
			System.out.println(gamer.getFirstName()+gamer.getLastName()+" veritabanına eklendi");
		}else {
			System.out.println("Kullanıcı bilgileri hatalı");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" veritabanından silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" bilgileri veritabanında güncellendi");
	}

}
