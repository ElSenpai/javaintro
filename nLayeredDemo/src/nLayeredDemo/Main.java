package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// TODO : Spring IoC ile cozulecek
		

		ProductService productService=new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter());
		
		
		
		Product product=new Product(1,1,"Elma",12,50);//business rule a takilacak
		Product product1=new Product(1,2,"Armut",32,40);
		
		productService.add(product);
		productService.add(product1);
		
		
		ProductService abcService=new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
		
		abcService.add(product1);
		
	}

}
