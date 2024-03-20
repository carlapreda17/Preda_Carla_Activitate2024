package classes;

public class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunEgronomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public Rezervare(boolean mancareInclusa, boolean scaunEgronomic, boolean bauturaRacoritoare, boolean muzicaAmbientala, boolean genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunEgronomic = scaunEgronomic;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunEgronomic(boolean scaunEgronomic) {
        this.scaunEgronomic = scaunEgronomic;
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunEgronomic=").append(scaunEgronomic);
        sb.append(", bauturaRacoritoare=").append(bauturaRacoritoare);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}
