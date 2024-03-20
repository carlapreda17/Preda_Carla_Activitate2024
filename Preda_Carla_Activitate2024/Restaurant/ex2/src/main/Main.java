package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.setAsezareLaGeam(true).setDecorareMasa(true).setGenMuzica(true).setMuzicaAmbientala(true).setScauneEcgronomice(true).build();
        System.out.println(rezervare.toString());
        Rezervare rezervare1=rezervareBuilder.setAsezareLaGeam(true).build();
        System.out.println(rezervare1.toString());
    }
}