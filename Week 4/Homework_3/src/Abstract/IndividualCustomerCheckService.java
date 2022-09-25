package Abstract;

import Entities.IndividualCustomer;

public interface IndividualCustomerCheckService {
	boolean checkIfRealPerson(IndividualCustomer individualCustomer);
}
