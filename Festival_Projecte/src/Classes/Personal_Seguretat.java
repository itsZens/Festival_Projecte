package Classes;


import Enumeration.HumanNeeds;
import Enumeration.TipusTorn;

public class Personal_Seguretat extends Professional {

	/**
	 * Constructor
	 */
	public Personal_Seguretat(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			int horariInici, int horariFinal, float salari) {
		super(nom, cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
	}
	
	/**
	 * Per simular el procés de protecció de l'artista pel recinte
	 */
	public void EscoltaArtista() {
		System.out.println("*L'artista està sent escoltat fins a l'escenari atravessant els fans");
	}
	
	/**
	 * Per simular la regulació d'aforament
	 */
	public void RegulaEntrada() {
		System.out.println("*Passa un espectador...*");
		System.out.println("*Passa un espectador...*");
		System.out.println("*Passa un espectador...*");
	}
	
	/**
	 * Per simular que es vigila el recinte
	 */
	public void AsseguraPerímetre() {
		System.out.println("*Perímetre assegurat*");
	}

	/**
	 * Mètode ComplirNecessitats() personal·litzat pel personal de seguretat
	 */
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("La persona de seguretat " + nom + " " + cognoms +" no té cap necessitat.");
		}		
	}
	
}
