package Classes;

import java.util.Date;

import Enumeration.TipusTorn;

public class Foodtruck extends Professional{
	
	private String nomEncarregat;
	private boolean esCap;
	private float recaudat;
	
	
	public Foodtruck(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			Date horariInici, Date horariFinal, float salari, String nomEncarregat, boolean esCap, float recaudat) {
		super(nom, cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
		this.nomEncarregat = nomEncarregat;
		this.esCap = esCap;
		this.recaudat = recaudat;
	}
	public String getNomEncarregat() {
		return nomEncarregat;
	}
	public void setNomEncarregat(String nomEncarregat) {
		this.nomEncarregat = nomEncarregat;
	}
	public boolean isEsCap() {
		return esCap;
	}
	public void setEsCap(boolean esCap) {
		this.esCap = esCap;
	}
	
	public void Serveix() {
		
		System.out.println("S'està servint el menjar....");
		
	}
	
	public float getRecaudat() {
		return recaudat;
	}
	public void setRecaudat(float recaudat) {
		this.recaudat = recaudat;
	}
	public float Cobra(float preu) {
		preu+= this.recaudat;
		return preu ;
		
		
	}

}
