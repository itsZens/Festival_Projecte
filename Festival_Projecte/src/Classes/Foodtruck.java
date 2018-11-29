package Classes;


import Enumeration.HumanNeeds;
import Enumeration.TipusTorn;

public class Foodtruck extends Professional{
	
	private String nomEncarregat;
	private boolean esCap;
	private float recaudat;
	
	/**
	 * Constructor
	 */
	public Foodtruck(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			int horariInici, int horariFinal, float salari, String nomEncarregat, boolean esCap, float recaudat) {
		super(nom, cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
		this.nomEncarregat = nomEncarregat;
		this.esCap = esCap;
		this.recaudat = recaudat;
	}
	
	public String getNomEncarregat() {
		return nomEncarregat;
	}
	
	public boolean isEsCap() {
		return esCap;
	}
	
	/**
	 * Per simular el procés de servir una comanda dut a terme per un treballador
	 */
	public void Serveix() {
		System.out.println("S'està servint el menjar....");	
	}
	
	public float getRecaudat() {
		return recaudat;
	}
	
	/**
	 * Per simular el procés de cobrar l'import de la comanda realitzada per algú
	 * @param Import a cobrar
	 */
	public float Cobra(float preu) {
		preu+= this.recaudat;
		return preu ;
	}
	
	/**
	 * Mètode ComplirNecessitats() personal·litzat per als treballadors del foodtruck
	 */
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("L'encarregat  " + nomEncarregat + " " + cognoms +" no té cap necessitat.");
		}		
	}
}
