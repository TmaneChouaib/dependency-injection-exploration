package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version 2 : version capteur");
        double temp=5;
        return temp ;
    }
}
