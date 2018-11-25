package Classes;
import Enumeration.MenuTipus;

public class Comanda {
	private double preuTotal;
	private boolean esAcabada;
	private MenuTipus tipusMenu;
	
	public Comanda(double preuTotal, MenuTipus tipusMenu) {
		this.preuTotal = preuTotal;
		this.tipusMenu = tipusMenu;
		this.esAcabada = false;
	}

	public double getPreuTotal() {
		return preuTotal;
	}

	public boolean isEsAcabada() {
		return esAcabada;
	}

	public void setEsAcabada(boolean esAcabada) {
		this.esAcabada = esAcabada;
	}

	public MenuTipus getTipusMenu() {
		return tipusMenu;
	}

	public void PreparacioComanda() {
		System.out.println("*Comanda en procés...*");
	}
	
	public void ComandaAcabada() {
		if(this.esAcabada == false) {
			this.setEsAcabada(true);
			System.out.println("*Comanda acabada*");
		}
	}
	
}
