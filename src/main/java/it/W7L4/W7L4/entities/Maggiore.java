package it.W7L4.W7L4.entities;

public class Maggiore extends Militare{

	@Override
	protected boolean rientra(double importo) {
		return importo <= 2000;
	}

	@Override
	protected void annunciaStipendio(double importo) {
		System.out.println("Lo stipendio del maggiore è uguale o minore di " + importo + "$");
		
	}

}
