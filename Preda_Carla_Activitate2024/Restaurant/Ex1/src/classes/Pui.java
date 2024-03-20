package classes;

public class Pui extends Supe{
    public Pui(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de pui "+getNume()+" are pretul: "+ getPret());
    }
}
