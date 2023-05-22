package pres;

import dao.IDao;
import business.IBusiness;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicPresentation {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, ClassCastException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner =new Scanner(new File("IoC-part-01/config.txt"));

        //Dynamic instantiation
        //The new Instance method is crossed out, because it is a "deprecated" method
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao)cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cBusiness=Class.forName(metierClassName);
        IBusiness business=(IBusiness) cBusiness.newInstance();

        //Invoke the setDao method of the MetierImpl class
        Method method=cBusiness.getMethod("setDao",IDao.class);
        method.invoke(business,dao);

        System.out.println("#######################################################################");
        System.out.println("######################### Dynamic Presentation ########################");
        System.out.println("#######################################################################");

        System.out.println("The DynamicPresentation class does dependency injection in a dynamic way.");
        System.out.println("Result => "+business.calculate());
    }
}
