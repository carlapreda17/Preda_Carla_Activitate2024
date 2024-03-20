package classes.factory;

import classes.Jucator;
import classes.Rezerva;

public class RezervaFactory implements JucatorFactory{
    @Override
    public Jucator createJucator(String nume, int varsta, int nr) {
        return new Rezerva(nr, nume, varsta);
    }
}
