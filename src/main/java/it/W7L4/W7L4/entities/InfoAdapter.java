package it.W7L4.W7L4.entities;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource {

	private Info info;
	
	public InfoAdapter(Info info) {
		this.info = info;
	}
	
	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		
	    Date infoNascita = info.getDataDiNascita();
	    Calendar dataNascita = Calendar.getInstance();
	    dataNascita.setTime(infoNascita);
	    
	    Calendar oggi = Calendar.getInstance();
	    
	    int eta = oggi.get(Calendar.YEAR) - (dataNascita.get(Calendar.YEAR)-1900);
	    
	    if(oggi.get(Calendar.MONTH) < dataNascita.get(Calendar.MONTH) ) {
	    	eta = eta - 1;
	    } else if (oggi.get(Calendar.DAY_OF_MONTH) < dataNascita.get(Calendar.DAY_OF_MONTH)) {
	    	eta = eta - 1;
	    }
	    return eta;
	}

}

/*Esercizio #1 (adapter)
	Scrivere il codice che implementa il pattern Adapter in una applicazione che deve usare le due classi seguenti. Ãˆ fornita anche lâ€™interfaccia usata dalla prima classe.
	
	In particolare, si noti che: 
	/- UseData chiama getNomeCompleto mentre Info mette a disposizione getNome e getCognome; 
	/- UseData chiama getEta mentre Info mette a disposizione getDataDiNascita; 
	/- Info non implementa lâ€™interfaccia DataSource. 
	Definire quindi una classe Adapter che implementi DataSource e possa essere utilizzata da UseData, ma 
	allo stesso tempo recuperi le informazioni da un oggetto di classe Info.
*/