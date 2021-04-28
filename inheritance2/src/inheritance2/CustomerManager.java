package inheritance2;

public class CustomerManager {
	Logger _logger;
	
	public CustomerManager(Logger logger) {
		super();
		this._logger = logger;
	}

	public void add() {
		System.out.println("müþteri eklendi");
		_logger.log();
	}

}
