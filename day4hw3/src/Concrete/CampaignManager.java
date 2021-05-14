package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void start(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasý baþlatýldý");
		
	}

	@Override
	public void end(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " kampanyasý sonlandýrýldý");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasý güncellendi");
		
	}

}
