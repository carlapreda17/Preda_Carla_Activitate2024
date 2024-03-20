package classes;

public class RezervareBuilder implements Builder{
    Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(false,false,false,false,false);
    }
    public RezervareBuilder setScaunEgronomic(boolean scaunEgronomic) {
        this.rezervare.setScaunEgronomic(scaunEgronomic);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.rezervare.setBauturaRacoritoare(bauturaRacoritoare);
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
