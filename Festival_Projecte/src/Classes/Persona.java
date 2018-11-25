package Classes;

import Enumeration.HumanNeeds;

public abstract class Persona {
	protected String nom;
	protected String cognoms;
	protected String DNI;
	protected int edat;
	protected HumanNeeds necessitats = HumanNeeds.Cap;
	protected boolean dintreRecinte = false;
	
	public Persona(String nom, String cognoms, String dNI, int edat) {
		this.nom = nom;
		this.cognoms = cognoms;
		DNI = dNI;
		this.edat = edat;
		this.necessitats = HumanNeeds.Cap;
		this.dintreRecinte = false;
	}

	public String getNom() {
		return nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public String getDNI() {
		return DNI;
	}

	public int getEdat() {
		return edat;
	}

	public HumanNeeds getNecessitats() {
		return necessitats;
	}

	public void setNecessitats(HumanNeeds necessitats) {
		this.necessitats = necessitats;
	}

	public boolean isDintreRecinte() {
		return dintreRecinte;
	}

	public void setDintreRecinte(boolean dintreRecinte) {
		this.dintreRecinte = dintreRecinte;
	}
	
	public void AccedeixenAlRecinte() {
		if(this.dintreRecinte == false) {
			this.setDintreRecinte(true);
		} else {
			System.out.println("La persona " + nom + " " + cognoms +" ja està dintre del recinte.");
		}
	}
	
	public void SurtenDelRecinte() {
		if(this.dintreRecinte == true) {
			this.setDintreRecinte(false);
		} else {
			System.out.println("La persona " + nom + " " + cognoms +" ja està fora del recinte.");
		}
	}
	
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("La persona " + nom + " " + cognoms +" no té cap necessitat.");
		}
	}
	
	public void DemanaComanda() {
		if(this.necessitats == HumanNeeds.Sed) {
			System.out.println("La persona " + nom + " " + cognoms +" està demanant una beguda.");
			this.setNecessitats(HumanNeeds.Cap);
		} else if(this.necessitats == HumanNeeds.Gana) {
			System.out.println("La persona " + nom + " " + cognoms +" està demanant alguna cosa per menjar.");
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println(nom + " " + cognoms + ": Buuff... massa cua per a les ganes que tinc.");
		}
	}

	@Override
	public String toString() {
		return "Em dic " + nom + " " + cognoms + ", el meu DNI és " + DNI + "i la meva edat és " + edat + ".";
	}

}
