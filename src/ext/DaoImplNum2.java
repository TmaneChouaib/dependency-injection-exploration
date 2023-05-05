package ext;

import dao.IDao;

public class DaoImplNum2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Implementation number 2 : sensor version");
        double temp=5;
        return temp ;
    }
}
