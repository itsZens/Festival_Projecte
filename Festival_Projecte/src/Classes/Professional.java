package Classes;

import java.util.Date;

public class Professional extends  Persona {
	
	protected String llocTreball;
	protected String tornDia;
	protected Date horariInici;
	protected Date horariFinal;
	protected float salari;
	public Professional(String nom, String cognoms, String DNI, int edat, String llocTreball, String tornDia,
			Date horariInici, Date horariFinal, float salari) {
		super(nom, cognoms, DNI, edat);
		this.llocTreball = llocTreball;
		this.tornDia = tornDia;
		this.horariInici = horariInici;
		this.horariFinal = horariFinal;
		this.salari = salari;
	}
	public String getLlocTreball() {
		return llocTreball;
	}
	public void setLlocTreball(String llocTreball) {
		this.llocTreball = llocTreball;
	}
	public String getTornDia() {
		return tornDia;
	}
	public void setTornDia(String tornDia) {
		this.tornDia = tornDia;
	}
	public Date getHorariInici() {
		return horariInici;
	}
	public void setHorariInici(Date horariInici) {
		this.horariInici = horariInici;
	}
	public Date getHorariFinal() {
		return horariFinal;
	}
	public void setHorariFinal(Date horariFinal) {
		this.horariFinal = horariFinal;
	}
	public float getSalari() {
		return salari;
	}
	public void setSalari(float salari) {
		salari = salari;
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
	
	public void IniciJornada(Date horaInici) {
		
		//if(horaInici < 8) {
		//fffff
			
		}
		
		 
	}
	

}
