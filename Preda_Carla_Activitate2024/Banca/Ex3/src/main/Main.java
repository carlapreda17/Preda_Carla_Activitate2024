package main;

import classes.Cont;
import classes.ContBuilder;

public class Main {
    public static void main(String[] args) {

        ContBuilder contBuilder=new ContBuilder();
        Cont cont1=contBuilder.build();
        System.out.println(cont1.toString());
    }
}