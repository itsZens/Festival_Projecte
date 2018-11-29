package Classes;


import Enumeration.HumanNeeds;
import Enumeration.TipusTorn;

public class Staff extends Professional{
	
	/**
	 * Constructor 
	 */
	public Staff(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			int horariInici, int horariFinal, float salari) {
		super(nom,  cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
	}
	
	/**
	 * Per simular ajut als espectadors
	 */
	public void AjudaEspectadors() {
		System.out.println("*Donant indicacions als assistents*");
	}

	/**
	 * Mètode ComplirNecessitats() personal·litzat per l'staff 
	 */
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("El professional " + nom + " " + cognoms +" no té cap necessitat.");
		}		
	}
}
