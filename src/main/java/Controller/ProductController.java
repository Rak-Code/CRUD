package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Product;
import Services.ProductServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductServices productServices;
	
	@GetMapping("/")
	public List<Product> getAllProducts(){
		
		return productServices.getAllProducts();
	}
	
	@PostMapping("/")
	public Product createProduct(@RequestBody Product product) {
		
		Product newCreateProduct =productServices.createProduct(product);
		return newCreateProduct;
	}
	
	
}
