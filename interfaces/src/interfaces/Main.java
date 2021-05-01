package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager cus=new CustomerManager(new EmailLogger());
		
		Customer engin=new Customer(1,"Engin","Demiroð");
		
		cus.add(engin);
		

	}

}
