package classes;

public abstract class Supe {

    String nume;
    float pret;

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public Supe(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public abstract void afisareDetalii();
}
