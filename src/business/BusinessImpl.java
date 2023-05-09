package business;

import dao.IDao;

public class BusinessImpl implements IBusiness {

    //Loose coupling: 'We must depend on interfaces and not on classes'.
    //Also know that in 'java' an object which is not initialized its default value is null.

    private IDao dao;
    @Override
    public double calculate() {
        double tmp=dao.getData();
        double res=tmp*10;
        return res;
    }

    //'setDao' Will allow us to inject into the Dao variable an object of a class that implements the IDao interface.
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
