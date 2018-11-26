package Classes;

import Enumeration.HumanNeeds;

public class Sponsor extends  Persona  { 
	
	private String marcaSponsor;

	public Sponsor(String nom, String cognoms, String DNI, int edat, String marcaSponsor) {
		super(nom, cognoms, DNI, edat);
		this.marcaSponsor = marcaSponsor;
	}

	public String getMarcaSponsor() {
		return marcaSponsor;
	}

	public void setMarcaSponsor(String marcaSponsor) {
		this.marcaSponsor = marcaSponsor;
	}
	
	public void espaiPublicitari() {
		
		System.out.println("S'han posat els anuncis");
		//d
		
	}

	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println(nom + " " + cognoms +" "+ marcaSponsor+" no té cap necessitat.");
		}		
	}
	

}
