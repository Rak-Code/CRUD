package Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Product;

@Service
public class ProductServices {

	private List<Product> products = new ArrayList<Product>();
	
	
	
	public List<Product> getAllProducts(){
		return products;
	}
	
	public Product createProduct(Product product) {
		product.setId((int)products.size()+1);
		products.add(product);
		return product;
		
	}
	
}
