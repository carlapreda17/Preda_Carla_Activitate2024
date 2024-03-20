package classes;

public class Portar extends Jucator {
    public Portar(int nr, String nume, int varsta) {
        super(nr, nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul "+getNume()+" care joaca ca portar are varsta de "+getVarsta());
    }
}
