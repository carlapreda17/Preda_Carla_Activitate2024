package classes.factory;

import classes.Medicament;
import classes.Vitamine;

public class FabricaVitamine implements FabricaMedicamente{
    @Override
    public Medicament createMedicament(String nume, float pret) {
        return new Vitamine(nume,pret);
    }
}
