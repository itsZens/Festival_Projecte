package Classes;

public abstract class VIP extends Persona {
	protected int diesAssistencia;
	
	public VIP(String nom, String cognoms, String DNI, int edat) {
		super(nom, cognoms, DNI, edat);
		this.diesAssistencia = 2;
	}
	

	
}
