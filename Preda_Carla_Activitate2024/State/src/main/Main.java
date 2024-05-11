package main;

import classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Ionescu");
        pacient.seAgraveazaStarea();
        pacient.seImbunatatesteStarea();
        pacient.vindecare();

    }
}