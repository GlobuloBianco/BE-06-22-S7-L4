package it.W7L4.W7L4.entities;

public class Capitano extends Militare {

	@Override
	protected boolean rientra(double importo) {
		return importo <= 1000;
	}

	@Override
	protected void annunciaStipendio(double importo) {
		 System.out.println("Lo stipendio del capitano è uguale o minore di " + importo + "$");
	}

}
/*Gli ufficiali percepiscono i seguenti stipendi:
- Capitano: 1000
- Maggiore: 2000
- Tenente: 3000
- Colonnello: 4000
- Generale: 5000*/