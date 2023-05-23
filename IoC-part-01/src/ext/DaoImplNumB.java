package ext;

import dao.IDao;

public class DaoImplNumB implements IDao {
    @Override
    public double getData() {
        System.out.println("Implementation number 2 : sensor version");
        double temp=5;
        return temp ;
    }
}
