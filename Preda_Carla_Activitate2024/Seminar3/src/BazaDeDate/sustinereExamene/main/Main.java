package BazaDeDate.sustinereExamene.main;

import BazaDeDate.sustinereExamene.classes.Student;
import BazaDeDate.sustinereExamene.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(123,"Pop Denis","popdenis@stud.ase.ro",3);
        Student student2=new Student(124,"Popescu Daria","popeescudaria@stud.ase.ro",1);
        Student student3=new Student(125,"Popa Diana","popadiana@stud.ase.ro",2);
        Student student4=new Student(127,"Butacu Ion","butacuion@stud.ase.ro",2);

        SustinereExamen examenPoo=new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCts=new SustinereExamen("Calitate si testare software");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student4);


    }


}
