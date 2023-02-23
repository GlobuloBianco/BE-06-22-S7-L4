package it.W7L4.W7L4.entities;

public class Generale extends Militare{

	@Override
	protected boolean rientra(double importo) {
		return importo <= 5000;
	}

	@Override
	protected void annunciaStipendio(double importo) {
		System.out.println("Lo stipendio del generale è uguale o minore di " + importo + "$");
	}

}
