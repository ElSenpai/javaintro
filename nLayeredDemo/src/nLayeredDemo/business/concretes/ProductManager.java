package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		//business rules -- iþ  kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		productDao.add(product);
		
		
	}

	@Override
	public void update(Product product) {
		
		productDao.update(product);
		
		
	}

	@Override
	public void delete(Product product) {
		productDao.delete(product);
		
		
	}

	@Override
	public Product get(int id) {
		
	return productDao.get(id);
		
		
	}

	@Override
	public List<Product> getAll() {
		
		return productDao.getAll();
	}
	
	

}
