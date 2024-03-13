package classes;

public class Inifirmier extends PersonalSpital{

    public Inifirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmierul "+ getNume()+" are urmatorul salariu: "+getSalariu());
    }
}
