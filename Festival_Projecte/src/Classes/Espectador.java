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
	@Override
	public void AccedeixenAlRecinte() {
		// TODO Auto-generated method stub
		super.AccedeixenAlRecinte();
	}
	@Override
	public void SurtenDelRecinte() {
		// TODO Auto-generated method stub
		super.SurtenDelRecinte();
	}
	
	public float Pagar(float preu) {
		
		return pressupost - preu;
		
		
	}
	
	
	

}
