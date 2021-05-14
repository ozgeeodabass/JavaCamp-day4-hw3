package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void start(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� ba�lat�ld�");
		
	}

	@Override
	public void end(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " kampanyas� sonland�r�ld�");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� g�ncellendi");
		
	}

}
