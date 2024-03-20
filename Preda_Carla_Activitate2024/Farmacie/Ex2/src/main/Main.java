package main;

import classes.Medicament;
import classes.factory.*;

public class Main {


    public static void main(String[] args) {
        FabricaMedicamente fabricaRaceala=new FabricaRaceala();
        FabricaMedicamente fabricaBody=new FabricaBody();
        FabricaMedicamente fabricaDurere=new FabricaDurere();
        FabricaMedicamente fabricaVitamine=new FabricaVitamine();

        Medicament raceala=fabricaRaceala.createMedicament("Paracetamol",10);
        Medicament vitamine=fabricaVitamine.createMedicament("Forcapil",60);
        raceala.afisareDetalii();
        vitamine.afisareDetalii();


    }
}