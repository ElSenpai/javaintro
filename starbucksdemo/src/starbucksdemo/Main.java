package starbucksdemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer senpai =new Customer();
		senpai.setId(1);
		senpai.setFirstName("Ahmet");
		senpai.setLastName("Uçar");
		senpai.setDateOfBirth(LocalDate.parse("1990-03-12"));
		senpai.setNationalIdentity("12345");
       BaseCustomerManager base=new StarbucksCustomerManager(new CustomerCheckManager());
       BaseCustomerManager nero=new NeroCustomerManager();
       nero.delete(senpai);
       base.add(senpai);
       base.getall(senpai);
	}

}
