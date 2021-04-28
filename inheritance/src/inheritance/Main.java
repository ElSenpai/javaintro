package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin= new IndividualCustomer();
		engin.customerNumber="12345";

		CorporateCustomer engin2= new CorporateCustomer();
		engin2.customerNumber="3345";
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.sendikaBiseyi="9999";
		abc.customerNumber="123422";
        
		CustomerManager cus =new CustomerManager();
		cus.add(engin2);
		cus.add(engin);
		cus.add(abc);
		
		Customer[] customers= {engin,abc,engin2};
		cus.addm(customers);
	}

}
