package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, ClassCastException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner =new Scanner(new File("config.txt"));
        //Instanciation dynamique
        //la methode new Instance elle est barrée, car elle est une methode "deprecated"
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao)cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        //invoker la methode setDao de la classe MetierImpl
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("#######################################################################");
        System.out.println("########################## Présentation Deux ##########################");
        System.out.println("#######################################################################");

        System.out.println("la classe Présentation2 fait l'injection des dépendance d'une manière dynamique.");
        System.out.println("Résultat => "+metier.calcul());
    }
}
