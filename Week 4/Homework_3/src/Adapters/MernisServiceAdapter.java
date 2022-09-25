package Adapters;

import java.rmi.RemoteException;

import Abstract.IndividualCustomerCheckService;
import Entities.IndividualCustomer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IndividualCustomerCheckService{

	@Override
	public boolean checkIfRealPerson(IndividualCustomer individualCustomer){
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(individualCustomer.getNationalityId()), 
					individualCustomer.getFirstName().toUpperCase(), 
					individualCustomer.getLastName().toUpperCase(), 
					individualCustomer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
