package main;

import classes.Medicament;
import classes.factory.Fabrica;
import classes.factory.TipMedicament;

public class Main {
    public static void main(String[] args) {
        Fabrica medicamentFactory=new Fabrica();
        try {
            Medicament raceala1=medicamentFactory.createMedicament(TipMedicament.RACEALA,"Paracetamol",20);
            Medicament body=medicamentFactory.createMedicament(TipMedicament.BODY,"Nospa",25);
            Medicament durere=medicamentFactory.createMedicament(TipMedicament.DURERE,"Nurofen",30);
            Medicament vitamine=medicamentFactory.createMedicament(TipMedicament.VITAMINE,"Forcapil",50);


            raceala1.afisareDetalii();
            body.afisareDetalii();
            durere.afisareDetalii();
            vitamine.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}