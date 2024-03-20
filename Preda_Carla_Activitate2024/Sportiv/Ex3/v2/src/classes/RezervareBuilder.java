package classes;

public class RezervareBuilder implements Builder {
    private boolean mancareInclusa;
    private boolean scaunEgronomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public RezervareBuilder() {
        this.bauturaRacoritoare=false;
        this.genMuzica=false;
        this.mancareInclusa=false;
        this.muzicaAmbientala=false;
        this.scaunEgronomic=false;
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public RezervareBuilder setScaunEgronomic(boolean scaunEgronomic) {
        this.scaunEgronomic = scaunEgronomic;
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        Rezervare rezervare=new Rezervare(mancareInclusa,scaunEgronomic,bauturaRacoritoare,muzicaAmbientala,genMuzica);
        return rezervare;
    }
}
