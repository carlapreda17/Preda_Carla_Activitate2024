package classes;

public abstract class Supe {
    public String nume;
    public float pret;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public Supe(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public abstract void afisareDetalii();

}
