package classes;

public class Durere extends Medicament{
    public Durere(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul pentru durere "+getNume()+" are pretul "+getPret());
    }
}
