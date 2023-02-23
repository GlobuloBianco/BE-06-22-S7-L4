package it.W7L4.W7L4.entities;

public abstract class Militare {
	 private Militare prossimo;
	 protected abstract boolean rientra(double importo);
	 protected abstract void annunciaStipendio(double importo);

	    public Militare setProssimo(Militare m) {
	        prossimo = m;
	        return m;
	    }

	    public void checkStipendio(double importo) {
	        if (rientra(importo)) {
	            annunciaStipendio(importo);
	            System.out.println("----------------------------------------------------------");
	        } else if (prossimo != null) {
	            prossimo.checkStipendio(importo);
	        } else {
	            System.out.println("Nessuno ha lo stipendio uguale o maggiore di " + importo + "$");
	            System.out.println("----------------------------------------------------------");
	        }
	    }


}