package classes;

public class ContBuilder implements Builder {
    Cont cont;

    public ContBuilder() {
        this.cont =  new Cont(false,false,false);
    }

    public ContBuilder setSalariu(boolean salariu) {
        this.cont.setSalariu(salariu);
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cont.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.cont.setInternetBanking(internetBanking);
        return this;
    }


    @Override
    public Cont build() {
        return cont;
    }
}
