package presentation;

import business.IBusiness;
import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicPresentation {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner = new Scanner(new File("config.txt"));

        String dacClassName = scanner.nextLine();
        Class cDao = Class.forName(dacClassName);
        IDao dao = (IDao) cDao.newInstance();

        String businessClassName = scanner.nextLine();
        Class cBusiness = Class.forName(businessClassName);
        IBusiness business = (IBusiness) cBusiness.newInstance();

        Method method = cBusiness.getMethod("setDao", IDao.class);
        method.invoke(business, dao);

        System.out.println("Dynamic presentation : ");
        System.out.println("Result => " + business.calculate());
    }
}
