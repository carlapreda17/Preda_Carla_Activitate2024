package classes;

public class RezervareBuilder implements Builder{
    private boolean asezareLaGeam;
    private boolean scauneEcgronomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public RezervareBuilder() {
        this.asezareLaGeam = false;
        this.scauneEcgronomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientala = false;
        this.genMuzica =false;
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
            this.asezareLaGeam=asezareLaGeam;
            return this;
    }

    public RezervareBuilder setScauneEcgronomice(boolean scauneEcgronomice) {
        this.scauneEcgronomice = scauneEcgronomice;
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilder  setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(asezareLaGeam,scauneEcgronomice,decorareMasa,muzicaAmbientala,genMuzica);
    }
}
