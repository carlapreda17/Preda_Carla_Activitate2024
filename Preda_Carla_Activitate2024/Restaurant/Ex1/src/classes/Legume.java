package classes;

public class Legume extends Supe{
    public Legume(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de legume "+getNume()+" are pretul: "+getPret());
    }
}
