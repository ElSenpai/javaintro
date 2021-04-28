package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Product product1= new Product(1,"Lenovao v15",15000,"16Gb Ram",10);
      
       
       Product product2= new Product();
       product2.setId(2);
       product2.setName("Lenovo v16");
       product2.setUnitPrice(10000);
       product2.setDiscount(10);
       product2.setDetail("8 Gb ram");
       Product product3= new Product(1,"Msi v15",15000,"16Gb Ram",10);
       
       
      Product[] products= {product1,product2,product3};
      
      for (Product product : products) {
		System.out.println(product.getName()+" "+product.getDetail());
	}
    
      System.out.println(product1.getId()+"  "+product1.getName()+"  "+product1.getUnitPrice()+"  "+product1.getDetail()+" " +product1.getUnitPriceAfterDiscount());
      
      Category category1=new Category();
      category1.setId(1);
      category1.setName("Bilgisayar");
      
      Category category2=new Category();
      category2.setId(2);
      category2.setName("Ev/Bahçe");
      
      ProductManager productManager=new ProductManager();
      productManager.addToCart(product1);
      System.out.println(category2.getName());
      
      
      
	}

}
