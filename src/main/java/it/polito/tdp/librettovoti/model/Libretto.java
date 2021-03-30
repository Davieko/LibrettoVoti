package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;



public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		super();
		voti = new ArrayList<>();
		
	}
	
	public void add(Voto v) {
		this.voti.add(v);
		
	}
	
}
