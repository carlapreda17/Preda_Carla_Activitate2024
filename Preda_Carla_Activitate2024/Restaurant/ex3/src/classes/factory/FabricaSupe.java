package classes.factory;

import classes.Legume;
import classes.Pui;
import classes.Supe;
import classes.Vita;

public class FabricaSupe {

    public Supe createSupa(TipuriSupe tipuriSupe, String nume, float pret) throws Exception {
       if(tipuriSupe==TipuriSupe.LEGUME){
           return new Legume(nume,pret);
       }
       if(tipuriSupe==TipuriSupe.PUI){
           return new Pui(nume,pret);
       }
       if(tipuriSupe==TipuriSupe.VITA){
           return new Vita(nume,pret);
       }
       else{
           throw new Exception("nu exista!");
       }
    }
}
