package dao;

public class DaoImplNumA implements IDao{
    @Override
    public double getData() {
        /*
            Connect to DB to retrieve temperature
        */
        System.out.println("Implementation number 1 : database version");
        double temp=Math.random()*40;
        return temp;
    }
}
