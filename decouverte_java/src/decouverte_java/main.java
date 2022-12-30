package decouverte_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		String promo = "Capge P3";
		System.out.println(promo);
		int nb_apprenant=12;
		System.out.println(nb_apprenant);
		nb_apprenant = nb_apprenant*2;
		System.out.println(nb_apprenant);
		nb_apprenant*=2;
		boolean isLaunched = true;
		System.out.println(isLaunched);
		double pi = 3.14;
		System.out.println(pi);
		String[] apprenants = {"Amal", "Nicolas", "Caroline", "Marina"};
		System.out.println(apprenants.length);
		for (int i=0; i<apprenants.length; i++) {
			System.out.println(apprenants[i]);
		}
		for(String apprenant : apprenants) {
			System.out.println(apprenant);
		}
		
//		Faire une liste de courses, les afficher dans l'ordre puis à l'envers. 
//		Affecter un prix pour chaque article. Afficher le prix total à la fin.
		 
		String[] courses = {"lait", "sucre", "beurre", "oeufs", "chocolat"};
		for (int i = 0; i<courses.length;i++) {
			System.out.println(courses[i]);
		} 
		for (int i = courses.length -1; i>=0; i--) {
			System.out.println(courses[i]);
		}
		Map<String, Float> course = new HashMap<>();
		course.put("lait", (float)2.00);
		course.put("sucre", (float)1.00);
		course.put("beurre", (float)0.80);
		course.put("oeufs", (float)2.50);
		course.put("chocolat", (float)2.00);
		float prix_tt= (float)0.0;
		for(Map.Entry<String, Float> entry : course.entrySet()) {
			prix_tt += entry.getValue();
		}
		System.out.println(prix_tt);
		
		
		Pont unpont = new Pont();
		unpont.longueur= 200.0;
		unpont.largeur= 100.0;
		double surface = unpont.longueur*unpont.largeur; //ne permet de récupérer que pour un pont
		System.out.println(surface);
		System.out.println(unpont.getSurface());//permet de générer dans le fichier pont un comportement et de l'exécuter pour tous les éléments
		Pont towerBridge = new Pont();
		towerBridge.longueur= 286.0;
		towerBridge.largeur=15.0;
		System.out.println(towerBridge.getSurface());

		
		Groceries milk = new Groceries();
		Groceries sugar = new Groceries();
		Groceries butter = new Groceries();
		Groceries eggs = new Groceries();
		Groceries chocolate = new Groceries();
		milk.price = 2.5;
		milk.name = "lait";
		sugar.price = 0.9;
		sugar.name = "sucre";
		butter.price = 3.0;
		butter.name = "beurre";
		eggs.price = 3.5;
		eggs.name = "oeufs";
		chocolate.price = 1.8;
		chocolate.name = "chocolat";
		Groceries[] cakeList = {milk, sugar, butter, eggs, chocolate};
		System.out.println(totalPrice(cakeList));
		list(cakeList);
	}
		public static double totalPrice(Groceries[] cakeList) {
		double price=0;
		for (Groceries onePproduct : cakeList) {
			price += onePproduct.price;
		}
		return price;
		}
		
		public static double list(Groceries[] cakeList) {
			double price=0;
			for(Groceries onePproduct : cakeList) {
			            System.out.println(onePproduct.name);
			}
			return price;
		
		//ajouter quantité, modifier prix total, ajouter la classe pour la collection liste de courses, permettant d'ajouter, supprimer et lister les objets

//		for (int i = 0; i<cakeList.length;i++) {
//			System.out.println(cakeList[i].name);
//		} 
}
}

/*Code Nahim
public static void main(String[] args) {
    Article pomme = new Article();
    pomme.prix=1.00;
    pomme.designation="Pomme";
    Article orange = new Article();
    orange.prix=1.50;
    orange.designation="Orange";
    Article banane = new Article();
    banane.prix=2.00;
    banane.designation="Banane";
    Article[] liste_course = {pomme, orange, banane};
    System.out.println(prixTt(liste_course));
    lister(liste_course);
}

public static double prixTt(Article[] liste_course) {
    double prix = 0;
    for(Article unarticle : liste_course) {
        prix += unarticle.prix;
    }
    return prix;
}

public static void lister(Article[] liste_course) {
    for(Article unarticle : liste_course) {
        System.out.println(unarticle.designation);
    }
}*/