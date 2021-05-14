import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("654545454","Özge","Odabaþ",LocalDate.of(1999, 11, 26));
		GamerManager gamerManager= new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		
		System.out.println("\n ********************************* \n");
		
		Game game1= new Game(1,"Pubg",150);
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		
		System.out.println("\n ********************************* \n");
		

		Campaign campaign = new Campaign(1, "Yaz Tatili", 25, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 5, 15)); 
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.start(campaign);
		
		System.out.println("\n ********************************* \n");
		
		SaleManager saleManager = new SaleManager(campaignManager);
		saleManager.saleWithCampaign(game1, gamer1, campaign);
		
		
		
		
		
		

	}

}
