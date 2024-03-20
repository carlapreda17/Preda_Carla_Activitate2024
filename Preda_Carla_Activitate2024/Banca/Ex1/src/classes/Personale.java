package classes;

public class Personale extends Credite{
    public Personale(int dobanda, int valoare) {
        super(dobanda, valoare);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Creditul personal cu valoare de "+getValoare()+ " are dobanda "+getDobanda());
    }
}
