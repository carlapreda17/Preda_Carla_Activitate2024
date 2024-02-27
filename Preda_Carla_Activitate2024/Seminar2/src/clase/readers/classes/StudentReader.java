package clase.readers.classes;

import clase.Aplicant;
import clase.Student;
import clase.readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

        public StudentReader(String fileName){
            super(fileName);
        }

        public  List<Aplicant> read(String fileName) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Aplicant aplicant=new Student();
            super.readAplicant(input,aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
