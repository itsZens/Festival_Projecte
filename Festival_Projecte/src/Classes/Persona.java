package Classes;

import Enumeration.HumanNeeds;
import Interfaces.Públic_Festival;

public abstract class Persona implements Públic_Festival{
	protected String nom;
	protected String cognoms;
	protected String DNI;
	protected int edat;
	protected HumanNeeds necessitats = HumanNeeds.Cap;
	protected boolean dintreRecinte = false;
	
	/**
	 * Constructor
	 */
	public Persona(String nom, String cognoms, String DNI, int edat) {
		this.nom = nom;
		this.cognoms = cognoms;
		if (this.validaDNI(DNI)) {
			this.DNI = DNI;
		} else {
			System.out.println("El DNI introduït no és vàlid.");
		}
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
	public void setDNI(String DNI) {
		if (this.validaDNI(DNI))
			this.DNI = DNI;
		else
			System.out.println("El DNI introduït no és vàlid.");
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
	
	/**
	 * Per simular el procés d'entrar al recinte
	 */
	public void AccedeixenAlRecinte() {
		if(this.dintreRecinte == false) {
			this.setDintreRecinte(true);
		} else {
			System.out.println("La persona " + nom + " " + cognoms +" ja està dintre del recinte.");
		}
	}
	
	/**
	 * Per simular el procés de sortir del recinte
	 */
	public void SurtenDelRecinte() {
		if(this.dintreRecinte == true) {
			this.setDintreRecinte(false);
		} else {
			System.out.println("La persona " + nom + " " + cognoms +" ja està fora del recinte.");
		}
	}
	
	public abstract void ComplirNecessitats();
	
	/**
	 * Per simular el de demanar una comanda
	 */	
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

	/**
	 * Redefinició del mètode toString() per a que es presenti la informació bàsica de cada persona
	 */
	@Override
	public String toString() {
		return "Em dic " + nom + " " + cognoms + ", el meu DNI és " + DNI + "i la meva edat és " + edat + ".";
	}
	
	/**
	 * Implementació de la interfície Public_Festival
	 */
	@Override
	public void Saltar() {
		
		System.out.println("La "+nom+" "+cognoms+" està saltant");
		
	}
	@Override
	public void Ballar() {
		
		System.out.println("La "+nom+" "+cognoms+" està ballant");
		
	}
	@Override
	public void Cantar() {
		
		System.out.println("La "+nom+" "+cognoms+" està cantant");
		
	}
	@Override
	public void GaudirActuacio() {
		
		System.out.println(nom+" "+cognoms+" sembla que li encanta");
		
	}
	@Override
	public void DescontentAmbActuacio() {
		
		System.out.println("La gent mostra la seva indignació");
		
	}
	
	/**
	 * Comprovar que el DNI introduït és vàlid
	 * @param Un dni
	 */
	private boolean validaDNI(String DNI){
		//Valida longitud
		if (DNI.length()!=9) 
			return false;
		//Valida que els 8 primers caràcters són dígits
		for (int i=0; i<DNI.length()-1;i++)
			if (!Character.isDigit(DNI.charAt(i))) 
				return false;
		//Valida que el darrer caràcter és una lletra
		if (!Character.isLetter(DNI.charAt(8))) 
			return false; 
		return true;
	}
}
