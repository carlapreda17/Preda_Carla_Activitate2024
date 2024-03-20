package classes.factory;

import classes.Credite;
import classes.Ipotecare;
import classes.Personale;

public class Factory {

    public Credite creareCredit(TipCredit tip,int valoare, int dobanda) throws Exception{
        switch (tip){
            case PERSONAL -> {
                return new Personale(dobanda,valoare);
            }
            case IPOTECARE -> {
                return new Ipotecare(dobanda,valoare);
            }
            default -> {
                throw new Exception("nu exista");
            }
        }
    }
}
