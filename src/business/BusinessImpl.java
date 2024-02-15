package business;

import dao.IDao;

public class BusinessImpl implements IBusiness {

    private IDao dao;

    @Override
    public double calculate() {
        double temp = dao.getData();
        double result = temp * 10;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
