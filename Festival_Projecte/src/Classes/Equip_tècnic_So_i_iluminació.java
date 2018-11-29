package Classes;


import Enumeration.HumanNeeds;
import Enumeration.TipusTorn;

public class Equip_tècnic_So_i_iluminació extends Professional {
	private String nomEncarregat;
	private boolean esCap;
	
	/**
	 * Constructor
	 */
	public Equip_tècnic_So_i_iluminació(String nom, String cognoms, String DNI, int edat,
			TipusTorn tornDia, int horariInici, int horariFinal, float salari, String nomEncarregat, boolean esCap) {
		super(nom, cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
		this.nomEncarregat = nomEncarregat;
		this.esCap = esCap;
	}
	public String getNomEncarregat() {
		return nomEncarregat;
	}
	
	public boolean isEsCap() {
		return esCap;
	}
	
	/**
	 * Per simular el procés de comprovació del so
	 */
	public void AjustaSo() {
		System.out.println("S'està comprovatn el so...");
		System.out.println("Provant 1, 2...");		
	}
	
	/**
	 * Per simular el procés de comprovació de la il·luminació
	 */
	public void AjustaIluminacio() {
		System.out.println("Ajustant il·luminació de l'escenari");
	}
	
	/**
	 * Per simular el procés de comprovació del so
	 */
	public void ActuacioSoIluminacio() {
		System.out.println("Activant les llums frontals de l'escenari..");
		System.out.println("Pujant so 3...");
	}
	
	/**
	 * Mètode ComplirNecessitats personal·litzat per a aquesta classe 
	 */
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("El tècnic " + nom + " " + cognoms +" no té cap necessitat.");
		}
	}
}
