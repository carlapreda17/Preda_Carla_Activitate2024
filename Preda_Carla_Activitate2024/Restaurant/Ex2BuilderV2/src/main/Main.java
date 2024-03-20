package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare1=rezervareBuilder.setAsezareLaGeam(true).setDecorareMasa(true).build();
        System.out.println(rezervare1);
        Rezervare rezervare2=rezervareBuilder.setAsezareLaGeam(true).setDecorareMasa(true).setGenMuzica(true).setScauneEcgronomice(true).build();
        System.out.println(rezervare2);

    }
}