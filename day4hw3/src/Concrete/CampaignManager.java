package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void start(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyası başlatıldı");
		
	}

	@Override
	public void end(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " kampanyası sonlandırıldı");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyası güncellendi");
		
	}

}
