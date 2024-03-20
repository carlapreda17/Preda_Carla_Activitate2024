package classes;

public class Vita extends Supe{
    public Vita(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de vita "+getNume()+" are pretul: "+getPret());
    }
}
