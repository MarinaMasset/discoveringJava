package decouverte_java;

public class Pont {
    public double longueur;
    public double largeur;
    
    public double getSurface() { //définit le comportement à exécuter dans le main
        return longueur*largeur;
    }
}