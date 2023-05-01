package pres;

import dao.DaoImpl;
import metier.MetierIml;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao= new DaoImpl();
        MetierIml metier=new MetierIml();
        metier.setDao(dao);
        System.out.println("resultat="+metier.calcul());
    }
}
