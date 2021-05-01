package interfaces;

public class CustomerManager {
	
   private	Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	
 
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " +customer.getFirstName());
		
		for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		}
	
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " +customer.getFirstName());
		for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		}
	}
}
