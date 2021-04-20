package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;


// POJO -Plain Old Java Object
// Java Bean
//Semplice contenitore di dati, senza logica
// il /** con invio prima di una classe o un metodo per abbinargli un commento
/**
 * 
 * 
 * @author davide_head
 *
 */
public class Voto {

	private String nomeCorso;
	private int voto;
	private LocalDate dataEsame;
	/**
	 * Costruttore della classe voto
	 * @param nome Nome del corso superato
	 * @param voto Voto ottenuto
	 * @param data Data di superamento
	 */
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nomeCorso = nome;
		this.voto = voto;
		this.dataEsame = data;
	}
	
	public String getNomeCorso() 						{ return this.nomeCorso; }
	public int getVoto() 								{ return this.voto; }
	public LocalDate getDataEsame() 					{ return this.dataEsame; }
	
	public void setNomeCorso(String _nomeCorso) 		{ this.nomeCorso = _nomeCorso; }
	public void setVoto(int _voto) 						{ this.voto = _voto; }
	public void setDataEsame(LocalDate _dataEsame)		{ this.dataEsame = _dataEsame; }
	
	@Override
	public String toString() {
		String v = "Esame: "+this.getNomeCorso()+" Voto: "+this.getVoto()+" Data: "+this.getDataEsame().toString();
		return v;
	}
}
