package Classes;
import Enumeration.TipusTorn;

public abstract class Professional extends  Persona implements Comparable<Professional> {
	
	protected String llocTreball;
	protected TipusTorn tornDia;
	protected int horariInici;
	protected int horariFinal;
	protected float salari;
	
	public Professional(String nom, String cognoms, String DNI, int edat, String llocTreball, TipusTorn tornDia,
			int horariInici, int horariFinal, float salari) {
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
	public int getHorariInici() {
		return horariInici;
	}
	public void setHorariInici(int horariInici) {
		this.horariInici = horariInici;
	}
	public int getHorariFinal() {
		return horariFinal;
	}
	public void setHorariFinal(int horariFinal) {
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
		int[] hora;
		//hora=new int[5,6,7,8,9,1011121314151617];
			
		//ComprovaHorari(hora);
		
		super.SurtenDelRecinte();
	}        
	
	public void IniciJornada() {
		
		System.out.println("Comences a treballar: " + super.nom + " " + super.cognoms);
		}
	
	public void ComprovaHorari(int hora) {
		if(hora < horariInici || hora > horariFinal) {			
			System.out.println("Estàs fora del teu horari no pots accedir al recinte");			
		}else {
			System.out.println("Estàs dins del teu horari  pots accedir al recinte");
		}	 
	}
	
	@Override
	public int compareTo(Professional t) {
		if (this.salari == t.salari)		return 0;
		else if (this.salari > t.salari)	return 1;
		else 								return -1;
	}
}