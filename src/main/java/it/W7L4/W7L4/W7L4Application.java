package it.W7L4.W7L4;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.W7L4.W7L4.entities.Capitano;
import it.W7L4.W7L4.entities.Colonnello;
import it.W7L4.W7L4.entities.DataSource;
import it.W7L4.W7L4.entities.Generale;
import it.W7L4.W7L4.entities.Info;
import it.W7L4.W7L4.entities.InfoAdapter;
import it.W7L4.W7L4.entities.Libro;
import it.W7L4.W7L4.entities.Maggiore;
import it.W7L4.W7L4.entities.Militare;
import it.W7L4.W7L4.entities.Tenente;
import it.W7L4.W7L4.entities.UserData;

@SpringBootApplication
@SuppressWarnings("deprecation")
public class W7L4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(W7L4Application.class, args);
	}
	
	// switch esercizio
	boolean adapter = false;
	boolean composite = false;
	boolean chain = true;

	@Override
	public void run(String... args) throws Exception {
		if(adapter) { es1(); }
		if(composite) { es2(); }
		if(chain) { es3(); }
	}
	
	public void es1() {
		// Esercizio #1 (adapter)
		System.out.println("---------Esercizio 1---------");
		Info info = new Info();
		info.setNome("John");
		info.setCognome("Doe");
		info.setDataDiNascita(new Date(1980, 10, 20));
		
		System.out.println(info); // nome: John | Cognome: Doe | Data Nascita: 1980-10-6
		DataSource adapter = new InfoAdapter(info);
		 
	    UserData userData = new UserData();
	    userData.getData(adapter);
	    System.out.println(userData.getNomeCompleto()); // John Doe
	    System.out.println(userData.getEta()); // 42
	}
	
	public void es2() {
		// Esercizio #2 (composite)
		System.out.println("---------Esercizio 2---------");
	    ArrayList<String> autori = new ArrayList<>();
	    autori.add("John Doe");
	    autori.add("Jane Doe");
	    
	    Libro libro = Libro.builder()
	    		.pagine(400)
	    		.sezioni(20)
	    		.autori(autori)
	    		.prezzo(20)
	    		.build();
	    libro.stampa();
	    
	}
	
	public void es3() {
		// Esercizio #3 (chain of responsibility)
	    /*Gli ufficiali percepiscono i seguenti stipendi:
	    	- Capitano: 1000
	    	- Maggiore: 2000
	    	- Tenente: 3000
	    	- Colonnello: 4000
	    	- Generale: 5000*/
		System.out.println("---------Esercizio 3---------");
		Militare capitano = new Capitano();
		Militare maggiore = new Maggiore();
		Militare tenente = new Tenente();
		Militare colonnello = new Colonnello();
		Militare generale = new Generale();
		
		capitano.setProssimo(maggiore).setProssimo(tenente).setProssimo(colonnello).setProssimo(generale);
		capitano.checkStipendio(1000);
		capitano.checkStipendio(1500);
		capitano.checkStipendio(2000);
		capitano.checkStipendio(3000);
		capitano.checkStipendio(4000);
		capitano.checkStipendio(5000);
		capitano.checkStipendio(6000);
	}
}