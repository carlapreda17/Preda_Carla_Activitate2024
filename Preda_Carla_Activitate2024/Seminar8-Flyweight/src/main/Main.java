package main;

import classes.Caracteristici;
import classes.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();

        Caracteristici caracteristici=new Caracteristici(10,14,"albastru");
        Caracteristici caracteristici1=new Caracteristici(11,20,"alb");
        Caracteristici caracteristici2=new Caracteristici(15,23,"mov");

    }
}