package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager cus=new CustomerManager(new FileLogger());
		
		Customer engin=new Customer(1,"Engin","Demiro�");
		
		cus.add(engin);
		

	}

}
