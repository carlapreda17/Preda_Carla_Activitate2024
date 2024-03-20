package classes.factory;

import classes.Body;
import classes.Medicament;

public class FabricaBody implements FabricaMedicamente{
    @Override
    public Medicament createMedicament(String nume, float pret) {
        return new Body(nume,pret);
    }
}
