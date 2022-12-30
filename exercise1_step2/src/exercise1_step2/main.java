package exercise1_step2;

/*
Étape 2 :
1. Ajouter la quantité aux propriétés des objets de la liste, et modifier le prix total en conséquence
2. Créer une classe pour y mettre la collection
3. On doit pouvoir : 
	ajouter un objet
	supprimer un objet
	lister les objets
*/

public class main {

	public static void main(String[] args) {
		GroceriesList cakeList = new GroceriesList();
		cakeList.addProduct(1.5, "lait", 2);
		cakeList.addProduct(0.8, "sucre", 1);
		cakeList.addProduct(2.5, "beurre", 2);
		cakeList.addProduct(2.2, "chocolat", 5);
		System.out.println(cakeList.totalPrice());
		System.out.println(cakeList);
		cakeList.removeProduct("Banane");
		System.out.println(cakeList);
	}
		
/* No need for these lines if we add the data into the parameters
Groceries cakeList[] = {milk, sugar, butter, chocolate};
		milk.price = 1.5;
		sugar.price = 0.8;
		butter.price = 2.5;
		chocolate.price = 2.2;

		milk.designation = "lait";
		sugar.designation = "sucre";
		butter.designation = "beurre";
		chocolate.designation = "chocolat";
		
		milk.quantity = 2; //3€
		sugar.quantity = 1; //0.8€
		butter.quantity = 2; //5€
		chocolate.quantity = 5; //11€
		
		GroceriesList cakeList = new GroceriesList();
        cakeList.addProduct(milk);
         cakeList.addProduct(sugar);
        cakeList.addProduct(butter);
        cakeList.addProduct(chocolate);
        System.out.println(cakeList.totalPrice());
        System.out.println(cakeList);
		}
	
		public static double totalPrice(Groceries[] cakeList) {
		double price=0;
		for (Groceries oneProduct : cakeList) {
			price += oneProduct.price *oneProduct.quantity;
		}
		return price;
	}
	
	public static void displayList(Groceries[] cakeList) {
	    for(Groceries oneProduct : cakeList) {
	        System.out.println(oneProduct.designation);
	    }
	}
*/
