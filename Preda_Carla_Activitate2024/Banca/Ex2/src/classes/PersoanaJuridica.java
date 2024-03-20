package classes;

public class PersoanaJuridica extends Serviciu{
    public PersoanaJuridica(String data, String denumire) {
        super(data, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Seriviciul pt persoane juridice "+getDenumire()+" realizat in data de "+getData());
    }
}
