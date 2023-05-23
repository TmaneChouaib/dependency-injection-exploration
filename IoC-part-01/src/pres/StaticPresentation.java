package pres;

import business.BusinessImpl;
import ext.DaoImplNumB;

public class StaticPresentation {
    /*
        new => Injecting dependencies through static instantiation
    */
    public static void main(String[] args) {

        //Static instantiation
        DaoImplNumB dao= new DaoImplNumB();
        BusinessImpl business=new BusinessImpl();
        business.setDao(dao);

        System.out.println("#######################################################################");
        System.out.println("######################### Static Presentation #########################");
        System.out.println("#######################################################################");

        System.out.println("The StaticPresentation class does dependencies injection in a static way.");
        System.out.println("Result => "+business.calculate());
    }
}
