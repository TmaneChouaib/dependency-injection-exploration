package dao;

//On vas créer une implementation de cette interface
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecter à la BD pour récupérer la température
        */
        double temp=Math.random()*40;
        return temp;
    }
}
