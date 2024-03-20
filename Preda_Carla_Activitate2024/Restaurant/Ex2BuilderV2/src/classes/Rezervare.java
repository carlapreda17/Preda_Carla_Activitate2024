package classes;

public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneEcgronomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public Rezervare(boolean asezareLaGeam, boolean scauneEcgronomice, boolean decorareMasa, boolean muzicaAmbientala, boolean genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneEcgronomice = scauneEcgronomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneEcgronomice(boolean scauneEcgronomice) {
        this.scauneEcgronomice = scauneEcgronomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
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
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneEcgronomice=").append(scauneEcgronomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}
