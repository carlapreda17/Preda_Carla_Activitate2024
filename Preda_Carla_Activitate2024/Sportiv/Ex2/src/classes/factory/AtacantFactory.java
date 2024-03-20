package classes.factory;

import classes.Atacant;
import classes.Jucator;

public class AtacantFactory implements JucatorFactory{
    @Override
    public Jucator createJucator(String nume, int varsta, int nr) {
        return new Atacant(nr,nume,varsta);
    }
}
