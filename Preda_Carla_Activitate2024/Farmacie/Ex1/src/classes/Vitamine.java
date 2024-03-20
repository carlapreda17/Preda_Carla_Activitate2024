package classes;

public class Vitamine extends Medicament{
    public Vitamine(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul de vitamine "+getNume()+" are pretul: "+getPret());
    }
}
