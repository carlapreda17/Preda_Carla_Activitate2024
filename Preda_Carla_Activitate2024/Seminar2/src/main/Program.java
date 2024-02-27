package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Aplicant;
import clase.readers.classes.AngajatReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AngajatReader angajatReader=new AngajatReader();
		try {

			listaAngajati = angajatReader.read("C:\\CTS\\Preda_Carla_Activitate2024\\Seminar2\\angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
