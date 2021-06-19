package abstracts;

import entity.Campaign;
import entity.Game;

public interface ICampaignService {
    public void add(Campaign campaign);
    public void update(Campaign campaign);
    public void delete(Campaign campaign);
}
