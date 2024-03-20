package main;

import classes.Rezervare;
import classes.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare prototip=new Rezervare("Ioan",2,4);
        RezervareAbstracta rezervare1=prototip.clone();
        System.out.println(prototip.toString());
        System.out.println(rezervare1.toString());
        prototip.setNrPersoane(3);
        System.out.println(prototip.toString());
        System.out.println(rezervare1.toString());

    }
}