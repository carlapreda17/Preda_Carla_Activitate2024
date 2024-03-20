package classes;

public class Rezervare implements RezervareAbstracta {
    private String numeClient;
    private int nrRezervare;
    private int nrPersoane;

    public Rezervare() {
       this.nrRezervare=0;
       this.nrPersoane=0;
       this.numeClient="";
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrRezervare(int nrRezervare) {
        this.nrRezervare = nrRezervare;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrRezervare() {
        return nrRezervare;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public Rezervare(String numeClient, int nrRezervare, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrRezervare = nrRezervare;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrRezervare=").append(nrRezervare);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervare=new Rezervare();
        rezervare.setNrRezervare(this.nrRezervare);
        rezervare.setNumeClient(this.numeClient);
        rezervare.setNrPersoane(this.nrPersoane);
        return rezervare;

    }
}
