package classes.fabrica;

import classes.*;

public class FabricaPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int salariu) throws Exception{
        switch (tipPersonal){
            case MEDIC:
                Medic medic=new Medic(nume,salariu);
                return medic;
            case ASISTENT:
                Asistent asistent=new Asistent(nume,salariu);
                return asistent;
            case BRANCARDIER:
                Brancardier brancardier=new Brancardier(nume,salariu);
                return brancardier;
            case INFIRIMIER:
                Inifirmier inifirmier=new Inifirmier(nume,salariu);
                return inifirmier;
            default: throw new Exception("nu exista");
        }
    }
}
