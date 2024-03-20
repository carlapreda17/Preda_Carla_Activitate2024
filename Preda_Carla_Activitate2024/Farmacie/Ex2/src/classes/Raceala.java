package classes;

public class Raceala extends Medicament{
    public Raceala(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul pentru raceala "+ getNume()+" are pretul " + getPret());
    }
}
