package BazaDeDate.sustinereExamene.classes;

import BazaDeDate.sustinereExamene.classes.Student;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
   Map<Integer, Student> listaStudenti=new HashMap<>();
   private String numeMaterie;

    public SustinereExamen(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public void inregistrareStudent(Student student){
        if(listaStudenti.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume()+ " a sustinut deja examenul");
        } else {
            listaStudenti.put(student.getId(),student);
            System.out.println("Studentul " + student.getNume()+ " sustine acum examenul");
        }

    }
}
