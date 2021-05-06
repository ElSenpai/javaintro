package starbucksdem;

import java.rmi.RemoteException;

public interface CustomerCheckService {

	boolean checkIfRealPerson(String tc,String firstName,String lastName,int birtDate)throws RemoteException;
	
}
