package extention;

import dao.IDao;

public class DaoImpl_B implements IDao {
    @Override
    public double getData() {
        System.out.println("Implementation number 2: second version");
        double temp = 5;
        return temp;
    }
}
