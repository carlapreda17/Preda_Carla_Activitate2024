package classes;

public class FacturaBuilder implements Builder {
    Factura factura;

    public FacturaBuilder() {
        this.factura = new Factura(false,false,false,false);
    }
    public FacturaBuilder setNrPungi(boolean nrPungi) {
        this.factura.setNrPungi(nrPungi);
        return this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
        this.factura.setPlataCuCard(plataCuCard);
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public FacturaBuilder setCotaTVA(boolean cotaTVA) {
       this.factura.setCotaTVA(cotaTVA);
       return this;
    }

    @Override
    public Factura build() {
        return factura;
    }
}
