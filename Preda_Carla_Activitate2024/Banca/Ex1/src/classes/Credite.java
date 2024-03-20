package classes;

public abstract class Credite {
    private int dobanda;
    private int valoare;

    public int getDobanda() {
        return dobanda;
    }

    public int getValoare() {
        return valoare;
    }

    public Credite(int dobanda, int valoare) {
        this.dobanda=dobanda;
        this.valoare = valoare;
    }

    public abstract void afisareDetalii();
}
