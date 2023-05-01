package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    /*
        Injection des dépendances par
        instanciation statique => new
    */
    public static void main(String[] args) {

        //Instanciation static
        DaoImpl2 dao= new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);

        System.out.println("#######################################################################");
        System.out.println("############################# Présentation ############################");
        System.out.println("#######################################################################");

        System.out.println("la classe Présentation fait l'injection des dépendance d'une manière dynamique.");
        System.out.println("Résultat => "+metier.calcul());
    }
}
