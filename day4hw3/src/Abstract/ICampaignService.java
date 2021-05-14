package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	
	void start(Campaign campaign);
	void end(Campaign campaign);
	void update(Campaign campaign);
	

}
