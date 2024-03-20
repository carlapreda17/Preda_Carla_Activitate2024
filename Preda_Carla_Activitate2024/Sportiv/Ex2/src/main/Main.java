package main;

import classes.Jucator;
import classes.factory.FundasFactory;
import classes.factory.JucatorFactory;
import classes.factory.RezervaFactory;

public class Main {

    public static void prelucrareJucatori(JucatorFactory fabrica,String nume,int nr,int varsta){
        Jucator jucator= fabrica.createJucator(nume,varsta,nr);
        jucator.afisareDetalii();
    }
    public static void main(String[] args) {

        prelucrareJucatori(new FundasFactory(),"Ionita",23,33);
        prelucrareJucatori(new RezervaFactory(),"Popescu",3,22);

    }
}