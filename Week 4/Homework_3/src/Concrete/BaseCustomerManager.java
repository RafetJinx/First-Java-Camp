package Concrete;

import java.util.Scanner;

import Abstract.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	public void add(Customer customer) {
		System.out.println("Saved to db: "
				+ "\n Customer E-mail : " + customer.getEmail()
				+ "\n Customer contact number : " + customer.getContactNumber());
	}
	
	public void delete(Customer customer) {
		System.out.println("Deleted from db : "
				+ "\n Customer E-mail : " + customer.getEmail()
				+ "\n Customer contact number : " + customer.getContactNumber());
	}
	
	public void update(Customer customer) {
		System.out.println("New contact number : ");
		
		Scanner scanner = new Scanner(System.in);
		String newContactNumberString = scanner.nextLine();
		scanner.close();
		
		System.out.println("Old contact number : " + customer.getContactNumber());
		
		customer.setContactNumber(newContactNumberString);
		
		System.out.println("New contact number : " + customer.getContactNumber());
		
	}
}
