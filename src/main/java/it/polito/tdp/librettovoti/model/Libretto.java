package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;



public class Libretto {
	
	private List<Voto> voti;
	private int f;
	
	public Libretto() {
		super();
		voti = new ArrayList<>();
		
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public void stampaEsameDatoVoto(int voto) {
		for(Voto v: voti) {
			if(v.getVoto() == voto)
				System.out.println(v);
		}
	}
	
	public void stampaEsameDatoNome(String nome) {
		for(Voto v: voti) {
			if(v.getNomeCorso() == nome)
				System.out.println(v);
		}
	}
	
	public void controllaEsistenza(Voto esame) {
		for(Voto v: voti) {
			if(v.getNomeCorso() == esame.getNomeCorso() && v.getVoto() == esame.getVoto())
				this.f = 1;
			else
				this.f = 0;
		}
		if(f == 1)
			System.out.println("La valutazione esiste già nel libretto");
		else
			System.out.println("La valutazione non esiste nel libretto");
	}
	
	public void controllaConflitto(Voto esame) {
		for(Voto v: voti) {
			if(v.getNomeCorso() == esame.getNomeCorso() && v.getVoto() != esame.getVoto())
				this.f = 1;
			else
				this.f = 0;
		}
		if(f == 1)
			System.out.println("C'è conflitto");
		else
			System.out.println("Le cose sono ok, bravo");
	}
	
}
