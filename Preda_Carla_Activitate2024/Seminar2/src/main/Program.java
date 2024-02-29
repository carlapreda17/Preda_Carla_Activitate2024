package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Aplicant;
import clase.readers.classes.AngajatReader;
import clase.readers.interfaces.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader = new AngajatReader("C:\\CTS\\Preda_Carla_Activitate2024\\Seminar2\\angajati.txt");

		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}