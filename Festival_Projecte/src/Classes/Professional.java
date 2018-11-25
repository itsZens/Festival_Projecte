package Classes;


public class Professional extends  Persona {
	
	protected String llocTreball;
	protected String tornDia;
	protected int horariInici;
	protected int horariFinal;
	protected float salari;
	
	public Professional(String nom, String cognoms, String DNI, int edat, String llocTreball, String tornDia,
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
	public String getTornDia() {
		return tornDia;
	}
	public void setTornDia(String tornDia) {
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
		
		System.out.println("Estas treballant: "+super.nom+" "+super.cognoms);

			
		}
	
	public void ComprovaHorari(int hora) {
		if(hora< horariInici || hora > horariFinal) {
			
			System.out.println("Estas fora del teu horari no pots accedir al recinte");
			
		}else {
			System.out.println("Estas dins del teu horari  pots accedir al recinte");

		}
	
		
		 
	}
	

}