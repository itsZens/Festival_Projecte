package Classes;

import Enumeration.TipusEntrada;

public class Espectador extends Persona{
	 
	private int diesAssistencia;
	private float pressupost;
	private Enumeration.TipusEntrada tipusEntrada;
	public Espectador(String nom, String cognoms, String DNI, int edat, TipusEntrada tipusEntrada, int diesAssistencia,
			float pressupost) {
		super(nom, cognoms, DNI, edat);
		this.tipusEntrada = tipusEntrada;
		this.diesAssistencia = diesAssistencia;
		this.pressupost = pressupost;
	}
	public TipusEntrada getTipusEntrada() {
		return tipusEntrada;
	}
	
	public int getDiesAssistencia() {
		return diesAssistencia;
	}

	public float getPressupost() {
		return pressupost;
	}
	
	 
	
	public float Pagar(float preu) {
		
		return pressupost - preu;
		
		
	}
	
	
	
	
 }