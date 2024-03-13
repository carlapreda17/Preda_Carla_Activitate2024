package main;

import classes.PersonalSpital;
import classes.fabrica.FabricaPersonal;
import classes.fabrica.TipPersonal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal=new FabricaPersonal();
        try{
            PersonalSpital medic=fabricaPersonal.createPersonal(TipPersonal.MEDIC,"Popescu",10000);
            PersonalSpital asistent=fabricaPersonal.createPersonal(TipPersonal.ASISTENT,"Ionescu",4000);
            PersonalSpital brancardier=fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER,"Popa",6000);

            asistent.afisareDetalii();
            medic.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}