package it.W7L4.W7L4.entities;

public class Colonnello extends Militare{

	@Override
	protected boolean rientra(double importo) {
		return importo <= 4000;
	}

	@Override
	protected void annunciaStipendio(double importo) {
		System.out.println("Lo stipendio del colonnello è uguale o minore di " + importo + "$");
	}

}
