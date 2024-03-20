package main;

import classes.Legume;
import classes.Supe;
import classes.factory.FabricaLegume;
import classes.factory.FabricaPui;
import classes.factory.FabricaSupe;

public class Main {

    public Supe createFabrica(FabricaSupe fabricaSupe, String nume, float pret){
        return fabricaSupe.createSupa(nume,pret);
    }
    public static void main(String[] args) {
        FabricaSupe fabricaLegume=new FabricaLegume();
        Supe supaLegume=fabricaLegume.createSupa("Supa de rosii",24);
        supaLegume.afisareDetalii();

        FabricaSupe fabricaPui=new FabricaPui();
        Supe supaPui=fabricaLegume.createSupa("Supa pui", 27);
        supaPui.afisareDetalii();



    }
}