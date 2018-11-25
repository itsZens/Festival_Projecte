package Classes;

import java.util.GregorianCalendar;
import java.util.Random;

import sun.util.calendar.LocalGregorianCalendar.Date;

public abstract class Professional extends  Persona implements Comparable<Professional>  {
	
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
		this.salari = salari;
	}
	@Override
	public void AccedeixenAlRecinte() {
		super.AccedeixenAlRecinte();
	}
	@Override
	public void SurtenDelRecinte() {
		
		GregorianCalendar newDate = new GregorianCalendar();
		Random ComprovaHora = new Random();
		int hora = ComprovaHora.nextInt(17)+5;
		newDate.set(newDate.HOUR, hora);
		
		
			
		ComprovaHorari(newDate);
		
		super.SurtenDelRecinte();
	}        
	
	public void IniciJornada() {
		
		System.out.println("Estas treballant: "+super.nom+" "+super.cognoms);

			
		}
	
	public void ComprovaHorari(GregorianCalendar newDate) {
		
		
		if(newDate.before(8) || newDate.after(12)) {
			
			System.out.println("Estas fora del teu horari no pots accedir al recinte");
			
		}else {
			System.out.println("Estas dins del teu horari  pots accedir al recinte");

		}
	
		
		 
	}
	
	

}