package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.Product;
import Services.ProductServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/hello")
	public String Hello(){
		
		return "Hello";
	}
	
	@GetMapping("/{name}")
	public String myname(@PathVariable String name) {
		return "Hello" + name;
	}
	
	@GetMapping("/show")
	public String getMethod(@RequestParam String username,@RequestParam String password) {
		return "Hello "+username+" "+password;
	}
	
	@PostMapping("/")
	public Product createProduct(@RequestBody Product product) {
		
		Product newCreateProduct =productServices.createProduct(product);
		return newCreateProduct;
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
		
		return productServices.updateProduct(id, product);
	}
	
}
