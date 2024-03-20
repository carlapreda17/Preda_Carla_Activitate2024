package classes.factory;

import classes.Atacant;
import classes.Fundas;
import classes.Jucator;
import classes.Portar;

public class FabricaJucatori {

    public Jucator createJucator(TipJucator tip,String nume,int varsta,int nr) throws Exception{
        switch (tip){
            case FUNDAS -> {
                return new Fundas(nr,nume,varsta);
            }
            case PORTAR -> {
                return new Portar(nr,nume,varsta);
            }
            case ATACANT -> {
                return new Atacant(nr,nume,varsta);
            }
            default -> {
                throw new Exception("nu exista");
            }
        }
    }
}
