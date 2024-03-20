package main;

import classes.Supe;
import classes.factory.FabricaSupe;
import classes.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe=new FabricaSupe();
        try {
            Supe legume=fabricaSupe.createSupa(TipuriSupe.LEGUME,"Rosii",30);
            Supe vita=fabricaSupe.createSupa(TipuriSupe.VITA,"vacuta",32);
            legume.afisareDetalii();
            vita.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}