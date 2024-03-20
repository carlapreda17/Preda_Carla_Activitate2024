package classes;

public class Cont {
    private boolean salariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public Cont(boolean salariu, boolean cardAtasat, boolean internetBanking) {
        this.salariu = salariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public void setSalariu(boolean salariu) {
        this.salariu = salariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("salariu=").append(salariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
