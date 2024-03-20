package classes;

public class Body extends Medicament{

    public Body(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul de body "+ getNume()+ " are pretul de "+getPret());
    }
}
