package starbucksdem;

import java.rmi.RemoteException;

import mernis.KPSPublicSoapProxy;

public class MernisCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(String tc,String firstName,String lastName,int birtDate) throws RemoteException {
		KPSPublicSoapProxy hey=new KPSPublicSoapProxy();
		
		hey.TCKimlikNoDogrula(Long.parseLong(tc), firstName, lastName, birtDate);
		return true;
	}

}
