package classes.factory;

import classes.Jucator;

public interface JucatorFactory {
    public Jucator createJucator(String nume,int varsta,int nr);
}
