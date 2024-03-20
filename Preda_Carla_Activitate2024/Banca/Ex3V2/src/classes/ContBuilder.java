package classes;

public class ContBuilder implements Builder{
    private boolean salariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public ContBuilder() {
        this.cardAtasat=false;
        this.salariu=false;
        this.internetBanking=false;
    }

    public ContBuilder setSalariu(boolean salariu) {
        this.salariu = salariu;
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    @Override
    public Cont build() {
        return new Cont(salariu,cardAtasat,internetBanking);
    }
}
