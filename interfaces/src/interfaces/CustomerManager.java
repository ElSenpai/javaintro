package interfaces;

public class CustomerManager {
	
   private	Logger logger;
	
	public CustomerManager(Logger logger) {
		
		this.logger = logger;
	}

	
 
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " +customer.getFirstName());
		this.logger.log("loglandý");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " +customer.getFirstName());
	}
}
