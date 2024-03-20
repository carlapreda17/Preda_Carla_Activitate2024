package main;

import classes.Factura;
import classes.FacturaBuilder;

public class Main {
    public static void main(String[] args) {
        FacturaBuilder facturaBuilder=new FacturaBuilder();
        Factura factura1=facturaBuilder.build();
        Factura factura2=facturaBuilder.setNrPungi(true).setCardFidelitate(true).setPlataCuCard(true).build();
        System.out.println(factura1);
        System.out.println(factura2);


    }
}