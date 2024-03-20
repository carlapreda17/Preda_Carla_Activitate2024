package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare1=rezervareBuilder.build();
        Rezervare rezervare2=rezervareBuilder.setMuzicaAmbientala(true).setGenMuzica(true).build();
        System.out.println(rezervare2.toString());
        System.out.println(rezervare1.toString());

    }
}