package eStore.core.adapter;

public class EmailLogger implements LoggerService {

	@Override
	public void log(String message) {
		System.out.println("Lütfen Emaile Gelen Doðrulama kodunu giriniz : "+message);
		
	}

}
