package starbucksdem;

import java.rmi.RemoteException;

public class CustomerCheckManager implements CustomerCheckService {

	
	

	@Override
	public boolean checkIfRealPerson(String tc, String firstName, String lastName, int birtDate) throws RemoteException {
		System.out.println("Müþteri Id doðrulandý");
		return true;
	}

	

}
