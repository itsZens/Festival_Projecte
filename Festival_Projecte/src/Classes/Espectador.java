package Classes;
 public class Espectador extends Persona{
	 
	private String tipusEntrada;
	private int diesAssistencia;
	private float pressupost;
	public Espectador(String nom, String cognoms, String DNI, int edat, String tipusEntrada, int diesAssistencia,
			float pressupost) {
		super(nom, cognoms, DNI, edat);
		this.tipusEntrada = tipusEntrada;
		this.diesAssistencia = diesAssistencia;
		this.pressupost = pressupost;
	}
	public String getTipusEntrada() {
		return tipusEntrada;
	}
	public void setTipusEntrada(String tipusEntrada) {
		this.tipusEntrada = tipusEntrada;
	}
	public int getDiesAssistencia() {
		return diesAssistencia;
	}
	public void setDiesAssistencia(int diesAssistencia) {
		this.diesAssistencia = diesAssistencia;
	}
	public float getPressupost() {
		return pressupost;
	}
	public void setPressupost(float pressupost) {
		this.pressupost = pressupost;
	}
	 
	
	public float Pagar(float preu) {
		
		return pressupost - preu;
		
		
	}
	
	
	
 }