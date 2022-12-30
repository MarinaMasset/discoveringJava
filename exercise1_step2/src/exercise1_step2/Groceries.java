package exercise1_step2;

public class Groceries {
	public double price;
	public String designation;
	public int quantity;
	
	public Groceries(double price, String designation, int quantity) {
		this.price = price;
		this.designation = designation;
		this.quantity = quantity;
	}
	
	public String toString() {
		return quantity +" "+ designation+"\n";
	}
}