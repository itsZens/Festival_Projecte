package Classes;

import Enumeration.HumanNeeds;
import Enumeration.TipusTorn;

public class Artista extends Professional {
	private String nomArtistic;
	
	/**
	 * Constructor
	 */
	public Artista(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			int horariInici, int horariFinal, float salari, String nomArtistic) {
		super(nom, cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
		this.nomArtistic = nomArtistic;
	}

	public String getNomArtistic() {
		return nomArtistic;
	}


	
	public void Actua() {
		System.out.println("Està actuant....");
	}

	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("L'artista " + nom + " " + cognoms +" no té cap necessitat.");
		}
		
	}
	
	

	

}
