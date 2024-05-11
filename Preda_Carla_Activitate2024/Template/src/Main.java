import classes.Pacient;
import classes.SpitalPublic;
import classes.Template;

public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic=new SpitalPublic("Coltea",2);
        Pacient pacient1=new Pacient("Ionescu");
        Pacient pacient2=new Pacient("Popescu");
        Pacient pacient3=new Pacient("Mihai");

        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);

    }
}