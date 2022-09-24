package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseCustomerManager{
	GamerCheckService gamerCheckService;
	
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.add(gamer);
		} else {
			System.out.println("Gamer could not be added to the db because the gamer details are not corret.");
		}
	}
}
