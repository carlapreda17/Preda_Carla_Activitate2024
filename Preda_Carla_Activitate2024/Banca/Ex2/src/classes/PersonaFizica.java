package classes;

public class PersonaFizica extends Serviciu{

    public PersonaFizica(String data, String denumire) {
        super(data, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Seriviciul pt persoane fizice "+getDenumire()+" realizat in data de "+getData());
    }
}
