package Classes;

import java.util.Date;

import Enumeration.TipusTorn;

public class Personal_Seguretat extends Professional {

	public Personal_Seguretat(String nom, String cognoms, String DNI, int edat, String llocTreball, TipusTorn tornDia,
			Date horariInici, Date horariFinal, float salari) {
		super(nom, cognoms, DNI, edat, llocTreball, tornDia, horariInici, horariFinal, salari);
	}
	
	public void EscoltaArtista() {
		System.out.println("*L'artista està sent escoltat fins a l'escenari atravessant els fans");
	}
	
	public void RegulaEntrada() {
		System.out.println("*Passa un espectador...*");
		System.out.println("*Passa un espectador...*");
		System.out.println("*Passa un espectador...*");
	}
}
