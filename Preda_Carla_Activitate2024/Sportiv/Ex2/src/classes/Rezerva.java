package classes;

public class Rezerva extends Jucator{

    public Rezerva(int nr, String nume, int varsta) {
        super(nr, nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul "+getNume()+" care este rezerva are varsta de "+getVarsta());
    }
}
