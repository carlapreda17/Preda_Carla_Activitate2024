package classes.factory;

import classes.Medicament;
import classes.Raceala;

public class FabricaRaceala implements FabricaMedicamente{
    @Override
    public Medicament createMedicament(String nume, float pret) {
        return new Raceala(nume,pret);
    }
}
