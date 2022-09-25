import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.GamerManager;
import Concrete.IndividualCustomerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Gamer;

public class Main {
	public static void main(String[] args) {
		Game game = new Game(1, "League of Legends", LocalDate.of(2009, 10, 27), 100);
		
		
		Gamer gamer = new Gamer(
				1, 
				"gamer@gmail.com", 
				"123123123123", 
				1, 
				"Gamer First Name", 
				"Gamer Last Name", 
				LocalDate.of(2000, 01, 02), "12345678900", "MOBA");
		
		Campaign campaign = new Campaign(
				1, 
				"Black Friday", 
				"Technology", 
				LocalDate.of(2022, 11, 25), 
				LocalDate.of(2022, 11, 28), 
				35);
		
		
		
		IndividualCustomerManager gamerCustomer = new GamerManager(new MernisServiceAdapter());
		
		gamerCustomer.add(gamer);
		
		SaleManager saleManager = new SaleManager();
		
		saleManager.sell(game, gamer);
		
		saleManager.sell(game, campaign, gamer);
	}
}
