package starbucksdemo;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		Customer senpai =new Customer();
		senpai.setId(1);
		senpai.setFirstName("AHMET SALÝH");
		senpai.setLastName("UÇAR");
		senpai.setDateOfBirth(1990);
		senpai.setNationalIdentity("024");
       BaseCustomerManager base=new StarbucksCustomerManager(new CustomerCheckManager());
       BaseCustomerManager mernis=new StarbucksCustomerManager(new MernisCheckManager());
       BaseCustomerManager nero=new NeroCustomerManager();
       nero.delete(senpai);
       base.add(senpai);
       base.getall(senpai);
       mernis.add(senpai);
	}

}
