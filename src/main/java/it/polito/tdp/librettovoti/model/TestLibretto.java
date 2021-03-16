package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		System.out.println("Test metodi di Libretto");
		// creo il libretto all'interno del quale mettere i voti
		Libretto libretto = new Libretto();
		// creo un voto
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
		// dovrò fornire la classe libretto di un metodo che permette di aggiungere dei
		// voti
		libretto.add(voto1);// aggiungo un metodo add in Libretto
		libretto.add(new Voto("Fisica1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 9, 15)));
		
		System.out.println(libretto);
	}
}
