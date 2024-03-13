package main;

import classes.Medic;
import classes.PersonalSpital;
import classes.factory.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume,int salariu){
         PersonalSpital personalSpital=fabricaPersonal.createPersonal(nume,salariu);
         personalSpital.afisareDetalii();
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaMedic=new FabricaMedic();
        FabricaPersonal fabricaAsistent=new FabricaAsistent();
        FabricaBancardier fabricaBancardier=new FabricaBancardier();

        PersonalSpital medic =fabricaMedic.createPersonal("Ionescu",9000);
        PersonalSpital brancardier=fabricaBancardier.createPersonal("Popescu",6000);
        PersonalSpital asistent=fabricaAsistent.createPersonal("Popa",2000);

//        medic.afisareDetalii();
//        brancardier.afisareDetalii();
//        asistent.afisareDetalii();
//
        prelucrarePersonal(new FabricaMedic(),"Ionescu",7000);
        prelucrarePersonal(new FabricaInfirmier(),"Alexe",7000);


    }
}