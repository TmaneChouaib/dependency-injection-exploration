package presentation;

import business.BusinessImpl;
import dao.DaoImpl_A;

public class StaticPresentation {

    public static void main(String[] args) {
        DaoImpl_A daoImplA = new DaoImpl_A();
        BusinessImpl business = new BusinessImpl();
        business.setDao(daoImplA);

        System.out.println("static presentation : ");
        System.out.println("Result => "+business.calculate());
    }
}
