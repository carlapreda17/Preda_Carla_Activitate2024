package BazaDeDate.main;

import BazaDeDate.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1=ConexiuneBazaDeDate.getInstance("Baza1",20,"link1");
        ConexiuneBazaDeDate conexiune2=ConexiuneBazaDeDate.getInstance("Baza2",20,"link2");

        conexiune1.setNumeBaza("Baza2");
        conexiune1.setNrTabele(30);
        conexiune1.setLinkConexiune("link2");

        System.out.println(conexiune1);
        System.out.println(conexiune2);

    }
}