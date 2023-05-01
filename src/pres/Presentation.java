package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierIml;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao= new DaoImpl2();
        MetierIml metier=new MetierIml();
        metier.setDao(dao);
        System.out.println("resultat="+metier.calcul());
    }
}
