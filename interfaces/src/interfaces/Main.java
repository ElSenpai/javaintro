package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new EmailLogger()};
		CustomerManager cus=new CustomerManager(loggers);
		
		Customer engin=new Customer(1,"Engin","Demiro�");
		
		cus.add(engin);
		

	}

}
