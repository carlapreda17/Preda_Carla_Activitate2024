package clase.readers.classes;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader {

    public List<Aplicant> read(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev elev=new Elev();
            int clasa = input2.nextInt();
            String tutore = input2.next();
            Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
