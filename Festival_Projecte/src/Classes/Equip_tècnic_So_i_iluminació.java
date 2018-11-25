package Classes;


import Enumeration.TipusTorn;

public class Equip_tècnic_So_i_iluminació extends Professional {
	private String nomEncarregat;
	private boolean esCap;
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
	
	public void AjustaSo() {
		
		System.out.println("S'està comprovatn el so...");
		System.out.println("Provant 1, 2...");

		
	}
	public void AjustaIluminacio() {
		System.out.println("Ajustan il·luminació de l'ecenari");
		
	}
	public void ActuacioSoluminacio() {
		
		System.out.println("Activa les llums frontals de l'ecenari..");
		System.out.println("Pujant so 3...");

	}
}
