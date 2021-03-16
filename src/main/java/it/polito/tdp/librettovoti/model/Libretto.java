package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

//sia ArrayList che LinkedList implementano entrambe l'interfaccia List, una è più efficace per elemtni da modificare laltra per elemtenti che si aggiungono in fondo e in ordine

public class Libretto {
	/* i "<>" sono i generics, in questo caso la lista è un interfaccia generica che può contenere oggetti di vario tipo 
	 * mettendo<Voto> sto dicendo che deve contenere oggetti di tipo Voto o una sua sotto classe*/
	private List<Voto> voti ;
	//implemento un costruttore
	public Libretto() {
		/*creo la lista nel momento in cui creo la classe libretto, devo creare un oggetto di una certa clsse specifica 
		 * ad esempio uso un arrayList, dato che ho creato la new per creare l'oggetto sono obblicato a specificare di che classe sarà */
		//metto this. per ricordarmi che è una variabile creata a livello di istanza, e non locale di questo metodo
		//potrei ripetere Voto dentro le <> ma lo capisce di suo
		this.voti = new ArrayList<>() ;
	}
	//creo metodo
	public void add(Voto v) {
		//aggiungo all'elenco dei voti che ho già quello nuovo che ho ricevuto
		//una classe di alto livello che ha un metodo add per implementare il metodo delega una classe interna a fare il lavoro
		this.voti.add(v) ;
	}
	
	public String toString() {
		//chiedo alla lista di convertirsi
		String s = "";
		//sintassi per iterare le liste o le collection
		for(Voto v: this.voti ) {
			s = s + v.toString() + "\n" ;
		}
		return s ;
	}
}
