package it.W7L4.W7L4.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Libro implements Lettura{
	private int pagine;
	private int sezioni;
	private ArrayList<String> autori;
	private double prezzo;
	
	@Override
	public void stampa() {
		System.out.println("il numero tot di pagine è di: " + pagine + " pagine.");
	}
	
    public void aggiungiAutore(String nome) {
        autori.add(nome);
    }
}
/* Esercizio #2 (composite)
Modellare questo dominio: 
â€“ Un libro Ã¨ composto da pagine, eventualmente organizzate in sezioni. Ogni sezione puÃ² contenere sottosezioni (una o piÃ¹) e pagine semplici. 
â€“ EÊ¼ possibile stampare una pagina singola, una sezione o lÊ¼intero libro.
- Il libro ha una lista di autori
- Il libro ha un prezzo
- Ogni sezione ha un numero di pagine che Ã¨ dato dalla somma delle pagine dei suoi sottoelementi
- Deve essere possibile chiedere al libro il numero totale di pagine */