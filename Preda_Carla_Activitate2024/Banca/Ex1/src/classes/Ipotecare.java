package classes;

public class Ipotecare extends Credite{
    public Ipotecare(int dobanda, int valoare) {
        super(dobanda, valoare);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Creditul ipotecar are valoarea "+ getValoare()+" si dobanda"+ getDobanda());
    }
}
