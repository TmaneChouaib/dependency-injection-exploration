package presentation;

import business.BusinessImpl;
import extention.DaoImpl_B;

public class StaticPresentation {

    public static void main(String[] args) {
        DaoImpl_B daoImplB = new DaoImpl_B();
        BusinessImpl business = new BusinessImpl();
        business.setDao(daoImplB);

        System.out.println("static presentation : ");
        System.out.println("Result => "+business.calculate());
    }
}
