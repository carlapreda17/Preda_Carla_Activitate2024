import classes.Portar;
import classes.VerificatorPeluza;
import classes.VerificatorTribuna;
import classes.VerificatorVip;
public class Main {
    public static void main(String[] args) {

        String suporter1 = "Gigel VIP";
        String suporter2 = "Gigel Tribuna";
        String suporter3 = "Gigel Peluza";

        Portar portar = new Portar();
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorVip());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter3);
    }
}