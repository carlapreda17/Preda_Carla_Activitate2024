package classes;

public class RezervareBuilder implements Builder {

    Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare=new Rezervare(false,false,false,false,false);
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareBuilder setScauneEcgronomice(boolean scauneEcgronomice) {
        this.rezervare.setScauneEcgronomice(scauneEcgronomice);
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
       this.rezervare.setGenMuzica(genMuzica);
       return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
