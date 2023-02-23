package it.W7L4.W7L4.entities;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("deprecation")
public class Info { 
	private String nome; 
	private String cognome; 
	private Date dataDiNascita; 

	

	@Override
	public String toString() {
		return "nome: " + nome + " | Cognome: " + cognome + " | Data Nascita: " + dataDiNascita.getYear() + "-" + dataDiNascita.getMonth() + "-" + dataDiNascita.getDay(); 
	}
}