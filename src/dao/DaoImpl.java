package dao;

//On vas créer une implementation de cette interface
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecter à la BD pour récupérer la température
        */
        System.out.println("version 1 : version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
