package inheritance2;

public class CustomerManager {
	Logger logger;
	
	public CustomerManager(Logger logger) {
		super();
		this.logger = logger;
	}
    //[LoggerAspect(new EmailLogger)]
	public void add() {
		System.out.println("müþteri eklendi");
		logger.log();
	}

}
