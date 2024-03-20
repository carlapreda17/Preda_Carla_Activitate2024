package classes.factory;

import classes.PersonaFizica;
import classes.Serviciu;

public class FabricaPersoanaFizica implements FabricaSerivcii{
    @Override
    public Serviciu createServiciu(String data, String denumire) {
        return new PersonaFizica(data,denumire);
    }
}
