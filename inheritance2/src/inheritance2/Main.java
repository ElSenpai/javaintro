package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomerManager cus=new CustomerManager(new DatabaseLogger());
       CustomerManager cus1=new CustomerManager(new FileLogger());
       CustomerManager cus2=new CustomerManager(new EmailLogger());
       cus.add();
       cus1.add();
       cus2.add();
	}

}
