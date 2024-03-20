package classes.factory;

import classes.Jucator;
import classes.Portar;

public class PortarFactory implements JucatorFactory{
    @Override
    public Jucator createJucator(String nume, int varsta, int nr) {
        return new Portar(nr,nume,varsta);
    }
}
