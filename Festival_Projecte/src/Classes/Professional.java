package Classes;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Enumeration.TipusTorn;
 
public abstract class Professional extends  Persona implements Comparable<Professional> {
	
	protected TipusTorn tornDia;
	protected int horariInici;
	protected int horariFinal;
	protected float salari;
	protected int tempsDisponibleDeDescans;
	

	
	public Professional(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			int horariInici2, int horariFinal2, float salari) {
		super(nom, cognoms, DNI, edat);
		this.tornDia = tornDia;
		this.horariInici = horariInici2;
		this.horariFinal = horariFinal2;
		this.salari = salari;
		this.tempsDisponibleDeDescans = 60;
	}
	
	
	public TipusTorn getTornDia() {
		return tornDia;
	}
	
	public int getHorariInici() {
		return horariInici;
	}
	
	public int getHorariFinal() {
		return horariFinal;
	}
	
	public float getSalari() {
		return salari;
	}
	
	
	public int getTempsDisponibleDeDescans() {
		return tempsDisponibleDeDescans;
	}
	
	@Override
	public void AccedeixenAlRecinte() {
		super.AccedeixenAlRecinte();
	}
	@Override
	public void SurtenDelRecinte() {
	    GregorianCalendar hora = new GregorianCalendar();
	    int horaAleatoria = randBetween(7, 23);
	    hora.set(Calendar.HOUR, horaAleatoria);
		ComprovaHorari(hora);
		
		
	}        
	
	public void IniciJornada() {
		
		System.out.println("Comences a treballar: " + super.nom + " " + super.cognoms);
		}
	
	private void ComprovaHorari(GregorianCalendar hora) {
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
	 protected void DescansJornada() {
		 
		 int descans = 15;
		 int tempsRestant= this.tempsDisponibleDeDescans -descans;
		 this.tempsDisponibleDeDescans = tempsRestant;
		 if(this.tempsDisponibleDeDescans == 0) {
			 System.out.println("No tens més temps per descançar");
		 }else {
			 System.out.println("Tens "+this.tempsDisponibleDeDescans);
		 }
		 
		 
		 
	 }
}