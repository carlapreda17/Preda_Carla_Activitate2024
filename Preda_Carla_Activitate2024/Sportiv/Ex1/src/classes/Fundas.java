package classes;

public class Fundas extends Jucator{
    public Fundas(int nr, String nume, int varsta) {
        super(nr, nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul "+getNume()+" care joaca ca fundas are varsta de "+getVarsta());
    }
}
