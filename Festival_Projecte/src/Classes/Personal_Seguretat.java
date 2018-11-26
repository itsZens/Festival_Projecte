package Classes;


import Enumeration.HumanNeeds;
import Enumeration.TipusTorn;

public class Personal_Seguretat extends Professional {

	public Personal_Seguretat(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			int horariInici, int horariFinal, float salari) {
		super(nom, cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
	}
	
	public void EscoltaArtista() {
		System.out.println("*L'artista està sent escoltat fins a l'escenari atravessant els fans");
	}
	
	public void RegulaEntrada() {
		System.out.println("*Passa un espectador...*");
		System.out.println("*Passa un espectador...*");
		System.out.println("*Passa un espectador...*");
	}
	
	public void AsseguraPerímetre() {
		System.out.println("*Perímetre assegurat*");
	}

	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("La persona de seguretat " + nom + " " + cognoms +" no té cap necessitat.");
		}		
	}
	
}
