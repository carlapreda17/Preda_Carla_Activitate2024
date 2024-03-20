package classes;

public abstract class Serviciu {
    private String data;
    private String denumire;

    public Serviciu(String data, String denumire) {
        this.data = data;
        this.denumire = denumire;
    }

    public String getData() {
        return data;
    }

    public String getDenumire() {
        return denumire;
    }
    public abstract void afisareDetalii();
}
