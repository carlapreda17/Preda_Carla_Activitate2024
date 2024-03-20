package classes;

public class Factura {
    private boolean nrPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private boolean cotaTVA;

    public Factura(boolean nrPungi, boolean plataCuCard, boolean cardFidelitate, boolean cotaTVA) {
        this.nrPungi = nrPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setNrPungi(boolean nrPungi) {
        this.nrPungi = nrPungi;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(boolean cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
