package starbucksdem;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Neroya müþteri eklendi :" +customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Neroda müþteri güncellendi :" +customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Neroda müþteri silindi :" +customer.getFirstName());
	}

	@Override
	public void getall(Customer customer) {
		System.out.println("Nero Müþteri Bilgileri ; " +customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getDateOfBirth()+" "+customer.getNationalIdentity());
		
	}

}
