package presentation;

import business.BusinessImpl;
import extention.DaoImpl_C;

public class StaticPresentation {

    public static void main(String[] args) {
        DaoImpl_C daoImpl = new DaoImpl_C();
        BusinessImpl business = new BusinessImpl();
        business.setDao(daoImpl);

        System.out.println("static presentation : ");
        System.out.println("Result => "+business.calculate());
    }
}
