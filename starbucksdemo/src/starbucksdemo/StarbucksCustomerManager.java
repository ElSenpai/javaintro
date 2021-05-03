package starbucksdemo;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		
		this.checkService = checkService;
	}

	@Override
	public void add(Customer customer) throws NumberFormatException, RemoteException {
		
		
			if(checkService.checkIfRealPerson(customer.getNationalIdentity(),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth())) {
				System.out.println("Sb müþteri eklendi :" +customer.getFirstName());
			}
		 else {
		 			System.out.println("Mevcut deðil");
				}
			
		
		
		
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Sb müþteri güncellendi :" +customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Sb müþteri silindi :" +customer.getFirstName());
	}

	@Override
	public void getall(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Sb Müþteri Bilgileri ; " +customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getDateOfBirth()+" "+customer.getNationalIdentity());
		
	}

}
