package Classes;

import java.util.Date;

import Enumeration.TipusTorn;

public class Artista extends Professional {
	
	

	private String nomArtistic;
	
	

	
	public Artista(String nom, String cognoms, String DNI, int edat, String llocTreball, TipusTorn tornDia,
			Date horariInici, Date horariFinal, float salari, String nomArtistic) {
		super(nom, cognoms, DNI, edat, llocTreball, tornDia, horariInici, horariFinal, salari);
		this.nomArtistic = nomArtistic;
	}

	public String getNomArtistic() {
		return nomArtistic;
	}

	public void setNomArtistic(String nomArtistic) {
		this.nomArtistic = nomArtistic;
	}
	
	public void Actua() {
		System.out.println("Està actuant....");
	}
	
	

	

}
