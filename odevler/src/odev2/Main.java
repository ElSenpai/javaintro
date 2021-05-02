package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomerManager customerManager= new CustomerManager();
       customerManager.add();
       customerManager.remove();
       customerManager.update();
       
       DortIslem dortIslem=new DortIslem();
       
       System.out.println(dortIslem.bol(10, 2));
       System.out.println(dortIslem.topla(10, 2));
       System.out.println(dortIslem.carp(10, 2));
       System.out.println(dortIslem.cikar(10, 2));
       
       Product product=new Product();
       product.id=1;
       product.name="Laptop";
       product.price=15000;
       product.stockAmount=5;
       product.description="Msi";
       
       ProductManager productManager=new ProductManager();
       productManager.add(product);
	}

}

