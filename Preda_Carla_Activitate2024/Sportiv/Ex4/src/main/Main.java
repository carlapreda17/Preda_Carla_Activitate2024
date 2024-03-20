package main;

import classes.Cont;
import classes.ContAbstract;

public class Main {
    public static void main(String[] args) {
        Cont prototip=new Cont();
        ContAbstract cont1=prototip.clone();
        System.out.println(cont1);
    }
}