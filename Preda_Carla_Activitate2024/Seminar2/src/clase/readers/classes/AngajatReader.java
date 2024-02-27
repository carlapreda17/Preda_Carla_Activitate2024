package clase.readers.classes;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader {
    public  List<Aplicant> read(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat=new Angajat();
            super.readAplicant(input2,angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
