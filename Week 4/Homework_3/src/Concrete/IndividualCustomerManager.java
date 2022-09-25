package Concrete;

import Abstract.IndividualCustomerCheckService;
import Entities.IndividualCustomer;

public class IndividualCustomerManager extends BaseCustomerManager{
	IndividualCustomerCheckService individualCustomerCheckService;

	public IndividualCustomerManager(IndividualCustomerCheckService individualCustomerCheckService) {
		this.individualCustomerCheckService = individualCustomerCheckService;
	}

	
	public void add(IndividualCustomer individualCustomer) {
		if(individualCustomerCheckService.checkIfRealPerson(individualCustomer)) {
			super.add(individualCustomer);
		} else {
			System.out.println("Individual customer could not be added to the db because "
					+ "the individual customer details are not corret.");
		}
	}
	
	
}
