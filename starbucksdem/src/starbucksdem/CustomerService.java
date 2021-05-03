package starbucksdem;

import java.rmi.RemoteException;

public interface CustomerService  {

	 void add(Customer customer)throws NumberFormatException, RemoteException;
	 void update(Customer customer);
	 void delete(Customer customer);
	 void getall(Customer customer);
	 
	
}
