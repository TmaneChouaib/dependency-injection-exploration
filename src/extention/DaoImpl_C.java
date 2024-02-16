package extention;

import dao.IDao;

public class DaoImpl_C implements IDao {
    @Override
    public double getData() {
        System.out.println("Implementation number 3 : third version");
        int temp = 30;
        return temp;
    }
}
