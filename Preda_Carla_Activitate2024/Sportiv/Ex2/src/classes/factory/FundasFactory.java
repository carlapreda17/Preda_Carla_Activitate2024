package classes.factory;

import classes.Fundas;
import classes.Jucator;

public class FundasFactory implements JucatorFactory{
    @Override
    public Jucator createJucator(String nume, int varsta, int nr) {
        return new Fundas(nr,nume,varsta);
    }
}
