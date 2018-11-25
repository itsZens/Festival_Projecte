package Classes;

import java.util.Date;

import Enumeration.TipusTorn;

public class Personal_Seguretat extends Professional {

	public Personal_Seguretat(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			Date horariInici, Date horariFinal, float salari) {
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
	
}
