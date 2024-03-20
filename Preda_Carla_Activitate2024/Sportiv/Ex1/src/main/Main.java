package main;

import classes.Jucator;
import classes.factory.FabricaJucatori;
import classes.factory.TipJucator;

public class Main {
    public static void main(String[] args) {
        FabricaJucatori fabricaJucatori=new FabricaJucatori();
        try {
            Jucator atacant= fabricaJucatori.createJucator(TipJucator.ATACANT,"Ionita",25,4);
            Jucator fundas=fabricaJucatori.createJucator(TipJucator.FUNDAS,"Laur",30,12);
            Jucator portar=fabricaJucatori.createJucator(TipJucator.PORTAR,"Popescu",27,11);
            atacant.afisareDetalii();
            fundas.afisareDetalii();
            portar.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}