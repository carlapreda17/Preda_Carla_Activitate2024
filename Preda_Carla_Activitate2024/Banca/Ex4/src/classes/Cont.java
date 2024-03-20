package classes;

public class Cont implements ContAbstract {
    private String cnp;
    private int nrCard;

    public Cont() {
        this.cnp="";
        this.nrCard=0;
    }

    public Cont(String cnp, int nrCard) {
        this.cnp = cnp;
        this.nrCard = nrCard;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setNrCard(int nrCard) {
        this.nrCard = nrCard;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("cnp='").append(cnp).append('\'');
        sb.append(", nrCard=").append(nrCard);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ContAbstract clone() {
        Cont cont=new Cont();
        cont.setCnp(cnp);
        cont.setNrCard(nrCard);
        return cont;
    }
}
