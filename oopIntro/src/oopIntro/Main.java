package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Product product1= new Product(1,"Lenovao v15",15000,"16Gb Ram");
      
       
       Product product2= new Product();
       product2.name="Lenovo v16";
       product2.id=2;
       product2.detail="32 Gb Ram";
       product2.unitPrice=16000;
       
       Product product3= new Product();
       product3.name="Hp V6";
       product3.id=3;
       
       product3.detail="16 Gb Ram";
       product3.unitPrice=10000;
       
      Product[] products= {product1,product2,product3};
      
      for (Product product : products) {
		System.out.println(product.name+" "+product.detail);
	}
    
      System.out.println(product1.id+"  "+product1.name+"  "+product1.unitPrice+"  "+product1.detail);
      
      Category category1=new Category();
      category1.id=1;
      category1.Name="Bilgisayar";
      
      Category category2=new Category();
      category2.id=2;
      category2.Name="Ev/Bahçe";
      
      ProductManager productManager=new ProductManager();
      productManager.addToCart(product1);
      
      
      
	}

}
