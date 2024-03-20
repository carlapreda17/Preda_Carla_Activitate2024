package main;

import classes.Credite;
import classes.factory.Factory;
import classes.factory.TipCredit;

public class Main {
    public static void main(String[] args) {
        Factory fabricaCredite=new Factory();
        try {
            Credite personal=fabricaCredite.creareCredit(TipCredit.PERSONAL,400000,20);
            personal.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}