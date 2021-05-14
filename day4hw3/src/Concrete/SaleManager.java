package Concrete;

import java.time.LocalDate;

import Abstract.ICampaignService;
import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService {
	
	ICampaignService campaignService;
	
	
	public SaleManager() {
		
	}
	public SaleManager(ICampaignService campaignService) {
		
		this.campaignService = campaignService;
	}
	
	

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+game.getGameName()+" oyununu sat�n ald� "
				+ "\n Oyun fiyat�: " +game.getPrice());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		
		double reducedPrice = game.getPrice() * ((100-campaign.getDiscountRate())/100);
		
		LocalDate start = campaign.getStartDate();
		LocalDate end = campaign.getEndDate();
		LocalDate today = LocalDate.now();
		
		if (start.getDayOfMonth() <= today.getDayOfMonth() && today.getDayOfMonth() <= end.getDayOfMonth()) {
			
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" " +game.getGameName()+" oyununu "+ campaign.getCampaignName()+
				" kampanyas� ile sat�n ald� \n"
				+ "Oyun fiyat�: " + reducedPrice );
			
	
		}else {
			System.out.println("Bu kampanya sona ermi�tir. Oyunu normal fiyat� �zerinden sat�n alabilirsinz.");
		}
		
		
		
		
	}
	

}
