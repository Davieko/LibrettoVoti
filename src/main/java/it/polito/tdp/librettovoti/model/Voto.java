package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

/*il pattern di programmazione delle classi java è che i campi devono essere privati 
e ogni classe deve avere un costruttore dei metodi setter e getter che danno accesso ai campi*/

// POJO -Plain Old Java Object
// Java Bean
//Semplice contenitore di dati, senza logica
// il /** con invio prima di una classe o un metodo per abbinargli un commento
/**
 * Memorizza il risultato di un esame singolo
 * 
 * @author davide_head
 *
 */
public class Voto {
	private String nome;
	private int voto; //30L come lo rappresento?
	private LocalDate data; //data superamento esame
	
	//creo costruttore metodi getter e setter tramite source -> generate construct from fields
	
	/**
	 * Costruttore della classe voto
	 * @param nome Nome del corso superato
	 * @param voto Voto ottenuto
	 * @param data Data di superamento
	 */
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data;
	}
	
	
	
}
