package Classes;

import Interfaces.Públic_Festival;

public abstract class VIP extends Persona implements Públic_Festival {
	protected int diesAssistencia;
	
	public VIP(String nom, String cognoms, String DNI, int edat) {
		super(nom, cognoms, DNI, edat);
		this.diesAssistencia = 2;
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
	
}
