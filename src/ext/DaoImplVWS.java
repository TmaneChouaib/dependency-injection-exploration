package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version 3 : version web service");
        int temp =30;
        return temp ;
    }
}
