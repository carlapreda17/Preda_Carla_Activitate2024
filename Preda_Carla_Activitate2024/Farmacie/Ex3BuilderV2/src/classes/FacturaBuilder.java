package classes;

public class FacturaBuilder implements Builder{
    private boolean nrPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private boolean cotaTVA;

    public FacturaBuilder() {
        this.cardFidelitate=false;
        this.cotaTVA=false;
        this.nrPungi=false;
        this.plataCuCard=false;
    }

    public FacturaBuilder setNrPungi(boolean nrPungi) {
        this.nrPungi = nrPungi;
        return this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
        return this;
    }

    public FacturaBuilder setCotaTVA(boolean cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }

    @Override
    public Factura build() {
        return new Factura(nrPungi,plataCuCard,cardFidelitate,cotaTVA);
    }
}
