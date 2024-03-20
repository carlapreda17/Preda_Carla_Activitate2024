package classes.factory;

import classes.PersoanaJuridica;
import classes.Serviciu;

public class FabricaPersoanaJuridica implements FabricaSerivcii{
    @Override
    public Serviciu createServiciu(String data, String denumire) {
        return new PersoanaJuridica(data,denumire);
    }
}
