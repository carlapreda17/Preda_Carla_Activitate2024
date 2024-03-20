package main;

import classes.Factura;
import classes.FacturaBuilder;

public class Main {
    public static void main(String[] args) {
        FacturaBuilder facturaBuilder=new FacturaBuilder();
        Factura factura1=facturaBuilder.setNrPungi(true).setCardFidelitate(true).build();
        System.out.println(factura1.toString());
        Factura factura2=facturaBuilder.build();
        System.out.println(factura2.toString());

    }
}