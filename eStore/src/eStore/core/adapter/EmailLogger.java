package eStore.core.adapter;

public class EmailLogger implements LoggerService {

	@Override
	public void log(String message) {
		System.out.println("L�tfen Emaile Gelen Do�rulama kodunu giriniz : "+message);
		
	}

}
