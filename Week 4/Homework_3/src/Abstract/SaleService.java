package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
	void sell(Game game, Customer customer);
	
	void sell(Game game, Campaign campaign, Customer customer);
}
