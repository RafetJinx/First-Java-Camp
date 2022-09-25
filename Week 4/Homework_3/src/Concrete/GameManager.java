package Concrete;

import java.time.LocalDate;
import java.util.Scanner;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game added to db.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted from db.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("New release date : ");
		
		Scanner scanner = new Scanner(System.in);
		LocalDate newReleaseDate = LocalDate.parse(scanner.nextLine());
		scanner.close();
		
		System.out.println("Old release date : " + game.getReleaseDate());
		game.setReleaseDate(newReleaseDate);
		System.out.println("New release date : " + game.getReleaseDate());
		
	}
	
}
