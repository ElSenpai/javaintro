package interfaces;

public class CustomerManager {
	
   private	Logger logger;
	
	public CustomerManager(Logger logger) {
		
		this.logger = logger;
	}

	
 
	public void add(Customer customer) {
		System.out.println("M��teri eklendi " +customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " +customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
}
