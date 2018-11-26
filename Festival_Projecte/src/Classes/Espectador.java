package Classes;

import Enumeration.HumanNeeds;
import Enumeration.TipusEntrada;
import Interfaces.Públic_Festival;

public class Espectador extends Persona implements Públic_Festival{
	 
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
	@Override
	public void Saltar() {
		
		System.out.println("Saltant");
		
	}
	@Override
	public void Ballar() {
		
		System.out.println("Ballant");
		
	}
	@Override
	public void Cantar() {
		
		System.out.println("Cantant");
		
	}
	@Override
	public void GaudirActuacio() {
		
		System.out.println("Sembla que li encanta");
		
	}
	@Override
	public void DescontentAmbActuacio() {
		
		System.out.println("La gent mostra la seva indignació");
		
	}
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("L'espectador " + nom + " " + cognoms +" no té cap necessitat.");
		}
		
	}
	
	
	
	
 }