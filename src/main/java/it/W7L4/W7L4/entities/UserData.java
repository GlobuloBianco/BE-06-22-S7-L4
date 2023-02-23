package it.W7L4.W7L4.entities;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public class UserData { 

	private String nomeCompleto; 	
	private int eta; 
	
	public void getData(DataSource ds) { 
		nomeCompleto = ds. getNomeCompleto(); 
		eta = ds.getEta(); 
	} 
} 