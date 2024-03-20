package classes.factory;

import classes.Supe;
import classes.Vita;

public class FabricaVita implements FabricaSupe{
    @Override
    public Supe createSupa(String nume, float pret) {
        return new Vita(nume,pret);
    }
}
