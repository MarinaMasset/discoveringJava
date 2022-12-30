package exercise1_step2;

import java.util.List;
import java.util.ArrayList;

public class GroceriesList {
	
	List<Groceries> cakeList = new ArrayList<>();
	
	public void addProduct(double price, String designation, int quantity) {
		Groceries oneProduct = new Groceries(price, designation, quantity);
				cakeList.add(oneProduct);
	}
	
	public void removeProduct(String designation) {
		for (Groceries oneProduct : cakeList) {
			if(oneProduct.designation == designation) {
			cakeList.remove(oneProduct);
			break;
			}
		}
	}
	
	public double totalPrice() {
		double price = 0;
		for(Groceries oneProduct : cakeList) {
			price += oneProduct.price * oneProduct.quantity;
		}
		return price;
	}
	
	public String toString() {
		String r = "";
		for(Groceries oneProduct : cakeList) {
			r += oneProduct.quantity + " " + oneProduct.designation + "\n";
		}
		return r;
	}
}
