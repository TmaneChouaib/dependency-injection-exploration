package ext;

import dao.IDao;

public class DaoImplNum3 implements IDao {
    @Override
    public double getData() {
        System.out.println("Implementation number 3 : web service version");
        int temp =30;
        return temp ;
    }
}
