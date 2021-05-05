package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// TODO : Spring IoC ile cozulecek
		

		ProductService productService=new ProductManager(new HibernateProductDao());
		
		Product product=new Product(1,1,"Elma",12,50);//business rule a takilacak
		Product product1=new Product(1,2,"Armut",32,40);
		productService.add(product);
		productService.add(product1);
		
	}

}
