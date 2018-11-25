package Classes;

public class Espectador  extends Persona{
	
	private String tipusEntrada;
	private int diesAssistencia;
	private float pressupost;
	public Espectador(String nom, String cognoms, String dNI, int edat, String tipusEntrada, int diesAssistencia,
			float pressupost) {
		super(nom, cognoms, dNI, edat);
		this.tipusEntrada = tipusEntrada;
		this.diesAssistencia = diesAssistencia;
		this.pressupost = pressupost;
	}
	
	
	
	
	

}
