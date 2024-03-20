package classes.factory;

import classes.*;

public class Fabrica {

    public Medicament createMedicament(TipMedicament tip,String nume,float pret) throws Exception{
        if(tip==TipMedicament.BODY){
            return new Body(nume,pret);
        }
        if(tip==TipMedicament.DURERE){
            return new Durere(nume,pret);
        }
        if(tip==TipMedicament.RACEALA){
            return new Raceala(nume,pret);
        }
        if(tip==TipMedicament.VITAMINE){
            return new Vitamine(nume,pret);
        }
        else{
            throw new Exception("Nu exista!");
        }
    }
}
