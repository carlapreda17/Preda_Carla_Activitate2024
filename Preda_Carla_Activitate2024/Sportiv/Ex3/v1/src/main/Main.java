package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare1=rezervareBuilder.build();
        Rezervare rezervare2=rezervareBuilder.setGenMuzica(true).setMuzicaAmbientala(true).build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}