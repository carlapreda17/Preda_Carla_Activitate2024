package main;

import classes.Serviciu;
import classes.factory.FabricaPersoanaFizica;
import classes.factory.FabricaPersoanaJuridica;
import classes.factory.FabricaSerivcii;

public class Main {

    public static void prelucrareServicii(FabricaSerivcii fabrica,String data,String denumire){
        Serviciu serviciu= fabrica.createServiciu(data,denumire);
        serviciu.afisareDetalii();
    }
    public static void main(String[] args) {
        prelucrareServicii(new FabricaPersoanaFizica(),"10/02/2022","s1");
        prelucrareServicii(new FabricaPersoanaJuridica(),"05/10/2023","s2");

    }
}