package AOP_shoppingCart;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String status) {
		//Logging
		//Authentication & Authorization
		//Sanitize the data
		System.out.println("Checking out");
	}
	
	public int quantity() {
		return 2;
	}
}
