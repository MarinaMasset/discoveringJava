package exercise1_groceries_correction;

public class main {

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
	}
}
