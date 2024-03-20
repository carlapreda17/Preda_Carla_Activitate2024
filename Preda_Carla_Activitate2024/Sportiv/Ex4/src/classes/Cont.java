package classes;

public class Cont implements ContAbstract{
    private String nume;
    private int varsta;
    private String nrTelefon;

    public Cont(String nume, int varsta, String nrTelefon) {
        this.nume = nume;
        if(varsta<18)
            throw new IllegalArgumentException("Varsta trebuie sa fie mai mare de 18 ani.");
        else {
            this.varsta=varsta;
        }
        if(nrTelefon.length()==10)
            throw new IllegalArgumentException("Numarul de telefon trebuie sa aiba 10 cifre.");
        else{
            this.nrTelefon = nrTelefon;
        }

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public Cont() {
        this.nume = "";
        this.varsta=0;
        this.nrTelefon="";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ContAbstract clone() {
        Cont cont=new Cont();
        cont.setNume("Ioana");
        cont.setNrTelefon("0737528181");
        cont.setVarsta(18);
        return cont;
    }
}
