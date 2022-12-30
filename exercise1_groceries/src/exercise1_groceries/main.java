/*
Étape 1 :
1. Créer une liste de courses
2. Stocker des articles dans la liste avec les propriétés "prix" et "designation"
3. Afficher le prix total
4. Lister (afficher) tous les objets
*/

package exercise1_groceries;

public class main {

	public static void main(String[] args) {
		
		//Create objects and put them in a list.
		Groceries milk = new Groceries();
		Groceries sugar = new Groceries();
		Groceries butter = new Groceries();
		Groceries chocolate = new Groceries();
		Groceries cakeList[] = {milk, sugar, butter, chocolate};
		
		//Add values to price property for every object.
		milk.price = 1.5;
		sugar.price = 0.8;
		butter.price = 2.5;
		chocolate.price = 2.2;
		
		//Add values to designation property for every object.
		milk.designation = "lait";
		sugar.designation = "sucre";
		butter.designation = "beurre";
		chocolate.designation = "chocolat";
		
		//For Loop to get the total price
		for (int i = 0; i < cakeList.length; i++) {
			double totalPrice=0;
			while (i < cakeList.length) {
				totalPrice += cakeList[i].price;
				i++;
			}
			//Display the total price
			System.out.println(totalPrice);
		}
		
//correction for totalPrice, this line is necessary when creating another function outside the main one
		//System.out.println(totalPrice(cakeList));
//correction for the display of objects in the list
		//displayList(cakeList);

		 
		
		//Display all objects in the list.
		for (int i = 0; i < cakeList.length; i++) {
			String ingredients = "";
			while (i < cakeList.length) {
				ingredients += cakeList[i].designation+" ";
				i++;
			}
			System.out.println(ingredients);
		}
	}
	
	/*
	//Correction totalPrice function
	public static double totalPrice(Groceries[] cakeList) {
		double price=0;
		for (Groceries oneProduct : cakeList) {
			price += oneProduct.price;
		}
		return price;
	}
	*/
	
	/*
	//Correction for displaying the objects in the list
	public static void displayList(Groceries[] cakeList) {
	    for(Groceries oneProduct : cakeList) {
	        System.out.println(oneProduct.designation);
	    }
	}
*/
}
