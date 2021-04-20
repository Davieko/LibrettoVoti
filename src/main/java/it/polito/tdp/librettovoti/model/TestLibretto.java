package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	/*Libretto e Voto per me umano hanno un significato diverso, per il complilatore sono entrambi degli oggetti: 
	in quanto tali sono descritti dalle rispettive classi e devono essere istanziati(concretizzati) nel main
	*/
	public static void main(String[] args) {
		Libretto libretto = new Libretto();
		Voto v1 = new Voto("Analisi 1", 25, LocalDate.of(2019,03,03));
		Voto v2 = new Voto("Fisica 1", 26, LocalDate.of(2019,03,13));
		Voto v3 = new Voto("Algebra", 29, LocalDate.of(2019,03,23));
		Voto v4 = new Voto("Chimica", 24, LocalDate.of(2019, 03,13));
		Voto v5 = new Voto("Chimica", 30, LocalDate.of(2019, 03, 23));
		
		libretto.add(v1);
		libretto.add(v2); 
		libretto.add(v3);
		
		libretto.stampaEsameDatoVoto(25);
		libretto.stampaEsameDatoNome("Fisica 1");
		libretto.controllaEsistenza(v4);
		libretto.controllaConflitto(v5);
	}
}
