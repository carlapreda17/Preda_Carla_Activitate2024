package classes;

public class Atacant extends Jucator{
    public Atacant(int nr, String nume, int varsta) {
        super(nr, nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul "+getNume()+" care joaca ca atacant are varsta de "+getVarsta());
    }
}
