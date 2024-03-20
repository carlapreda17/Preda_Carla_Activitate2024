package classes.factory;

import classes.Legume;
import classes.Supe;

public class FabricaLegume implements FabricaSupe{
    @Override
    public Supe createSupa(String nume, float pret) {
        return new Legume(nume,pret);
    }
}
