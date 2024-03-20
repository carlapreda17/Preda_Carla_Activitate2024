package classes.factory;

import classes.Serviciu;

public interface FabricaSerivcii {

    public Serviciu createServiciu(String data,String denumire);
}
