package Classes;

import Enumeration.HumanNeeds;
import Enumeration.TipusMitjaCom;

public class Press extends VIP{
	private TipusMitjaCom tipusMitjaComunicacio;
	private String nomMitjaComunicacio;
	
	/**
	 * Cosntructor
	 */
	public Press(String nom, String cognoms, String DNI, int edat, 
			 TipusMitjaCom tipusMitja, String nomMitja) {
		super(nom, cognoms, DNI, edat);
		this.tipusMitjaComunicacio = tipusMitja;
		this.nomMitjaComunicacio = nomMitja;
	}

	public TipusMitjaCom getTipusMitjaComunicacio() {
		return tipusMitjaComunicacio;
	}

	public String getNomMitjaComunicacio() {
		return nomMitjaComunicacio;
	}
	
	/**
	 * Per simular el procés d'opinar sobre una actuació
	 */
	public void CriticaActuacio(String nomArtista) {
		System.out.println("El periodista " + super.nom + " " + super.cognoms + 
				" ha criticat l'actuació de l'artista " + nomArtista + ". Haurem d'esperar a demà per saber la seva opinió.");
	}

	/**
	 * Mètode ComplirNecessitats() personal·litzat pels periodistes
	 */
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println(nom + " " + cognoms +" "+tipusMitjaComunicacio+" no té cap necessitat.");
		}		
	}
}
