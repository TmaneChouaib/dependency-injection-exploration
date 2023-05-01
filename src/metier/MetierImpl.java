package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    //Couplage faible : 'Il faut dépendre des interfaces et non pas des classes'.
    //À savoir aussi que dans 'java' un object qui n'est pas initialisé sa valeur par default c'est null.
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*10;
        return res;
    }
    //'setDao' va nous permettre d'injecter dans la variable Dao un object d'une classe qui implémente l'interface IDao.
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
