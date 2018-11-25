package Classes;
import java.util.GregorianCalendar;

import Enumeration.TipusTorn;
import sun.util.calendar.LocalGregorianCalendar.Date;

public abstract class Professional extends  Persona implements Comparable<Professional> {
	
	protected String llocTreball;
	protected TipusTorn tornDia;
	protected Date horariInici;
	protected Date horariFinal;
	protected float salari;
	
	public Professional(String nom, String cognoms, String DNI, int edat, String llocTreball, TipusTorn tornDia,
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
	public TipusTorn getTornDia() {
		return tornDia;
	}
	public void setTornDia(TipusTorn tornDia) {
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
	    GregorianCalendar hora = new GregorianCalendar();
	    int horaAleatoria = randBetween(7, 23);
	    hora.set(hora.HOUR, horaAleatoria);
		ComprovaHorari(hora);
		
		
	}        
	
	public void IniciJornada() {
		
		System.out.println("Comences a treballar: " + super.nom + " " + super.cognoms);
		}
	
	public void ComprovaHorari(GregorianCalendar hora) {
		if(tornDia == TipusTorn.Matí) {
		
			if(hora.before(9)|| hora.after(13)) {			
			System.out.println("Estàs fora del teu horari no pots accedir al recinte");	

			}else {
				System.out.println("Estàs dins del teu horari  pots accedir al recinte");
				 super.setDintreRecinte(false);

			}
		}else if(tornDia == TipusTorn.Tarda) {
			if(hora.before(13)|| hora.after(18)) {			
				System.out.println("Estàs fora del teu horari no pots accedir al recinte");	

			}else {
				System.out.println("Estàs dins del teu horari  pots accedir al recinte");
				 super.setDintreRecinte(false);

			}
		}else if(tornDia == TipusTorn.Nit) {
			if(hora.before(18)|| hora.after(23)) {			
				System.out.println("Estàs fora del teu horari no pots accedir al recinte");	

			}else {
				System.out.println("Estàs dins del teu horari  pots accedir al recinte");
				 super.setDintreRecinte(false);
			}
		}
		
		
	}
	
	@Override
	public int compareTo(Professional t) {
		if (this.salari == t.salari)		return 0;
		else if (this.salari > t.salari)	return 1;
		else 								return -1;
	}
	 private static int randBetween(int start, int end) {
	        return start + (int)Math.round(Math.random() * (end - start));
	    }
}