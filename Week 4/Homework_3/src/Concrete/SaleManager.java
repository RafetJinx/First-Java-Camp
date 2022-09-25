package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void sell(Game game, Customer customer) {
		System.out.println("User with e-mail : " + customer.getEmail() 
		+ " purchased game : " + game.getName()
		+ " price : " + game.getPrice());
	}

	@Override
	public void sell(Game game, Campaign campaign, Customer customer) {
		game.setPrice(
				(float)(
						game.getPrice() - 
							(game.getPrice() * 
								(campaign.getRatio() / 100.0))));
		
		System.out.println("User with e-mail : " + customer.getEmail() 
		+ " purchased game : " + game.getName()
		+ " price : " + game.getPrice()
		+ " campaign name : " + campaign.getName());
		
	}

}
