package Concrete;

import java.util.Scanner;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added to db.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaing deleted from db.");		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("New ratio :");
		
		Scanner scanner = new Scanner(System.in);
		int newRatio = scanner.nextInt();
		scanner.close();
		
		System.out.println("Old ratio :" + campaign.getRatio());
		campaign.setRatio(newRatio);
		System.out.println("New ratio :" + campaign.getRatio());
		
	}
	
}
