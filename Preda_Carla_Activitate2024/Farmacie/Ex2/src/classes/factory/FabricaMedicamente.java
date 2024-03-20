package classes.factory;

import classes.Medicament;

public interface FabricaMedicamente {

    public Medicament createMedicament(String nume,float pret);
}
