package it.W7L4.W7L4.entities;

public class Tenente extends Militare{

	@Override
	protected boolean rientra(double importo) {
		return importo <= 3000;
	}

	@Override
	protected void annunciaStipendio(double importo) {
		System.out.println("Lo stipendio del tenente è uguale o minore di " + importo + "$");
		
	}

}
