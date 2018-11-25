package Classes;

import Enumeration.TipusMitjaCom;
import Enumeration.TipusVIP;

public class Press extends VIP{
	private TipusMitjaCom tipusMitjaComunicacio;
	private String nomMitjaComunicacio;
	
	public Press(String nom, String cognoms, String DNI, int edat, 
			TipusVIP tipusVIP, TipusMitjaCom tipusMitja, String nomMitja) {
		super(nom, cognoms, DNI, edat, tipusVIP);
		this.tipusMitjaComunicacio = tipusMitja;
		this.nomMitjaComunicacio = nomMitja;
	}

	public TipusMitjaCom getTipusMitjaComunicacio() {
		return tipusMitjaComunicacio;
	}

	public String getNomMitjaComunicacio() {
		return nomMitjaComunicacio;
	}
	
	public void CriticaActuacio(String nomArtista) {
		System.out.println("El periodista " + super.nom + " " + super.cognoms + 
				" ha criticat l'actuació de l'artista " + nomArtista + ". Haurem d'esperar a demà per saber la seva opinió.");
	}
}