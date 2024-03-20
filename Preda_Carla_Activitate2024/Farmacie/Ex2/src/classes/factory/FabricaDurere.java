package classes.factory;

import classes.Durere;
import classes.Medicament;

public class FabricaDurere implements FabricaMedicamente{
    @Override
    public Medicament createMedicament(String nume, float pret) {
        return new Durere(nume,pret);
    }
}
