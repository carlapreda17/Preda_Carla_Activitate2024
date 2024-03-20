import classes.Cont;
import classes.ContAbstract;

public class Main {
    public static void main(String[] args) {

        Cont prototip=new Cont("12023322",4322);
        ContAbstract cont1=prototip.clone();
        System.out.println(cont1.toString());
    }
}