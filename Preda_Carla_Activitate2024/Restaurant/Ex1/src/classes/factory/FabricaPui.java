package classes.factory;

import classes.Pui;
import classes.Supe;

public class FabricaPui implements FabricaSupe{
    @Override
    public Supe createSupa(String nume, float pret) {
        return new Pui(nume,pret);
    }
}
