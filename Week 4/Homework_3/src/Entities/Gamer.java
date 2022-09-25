package Entities;

import java.time.LocalDate;

public class Gamer extends IndividualCustomer{
	
	private String interest;

	public Gamer(int customerId, String email, String contactNumber, int gamerId, String firstName, String lastName,
			LocalDate dateOfBirth, String nationalityId, String interest) {
		super(customerId, email, contactNumber, gamerId, firstName, lastName, dateOfBirth, nationalityId);
		this.interest = interest;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
}
