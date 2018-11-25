package Classes;

import java.util.Date;

import Enumeration.TipusTorn;

public class Staff extends Professional{

	public Staff(String nom, String cognoms, String DNI, int edat, TipusTorn tornDia,
			Date horariInici, Date horariFinal, float salari) {
		super(nom,  cognoms, DNI, edat, tornDia, horariInici, horariFinal, salari);
	}
	
	public void AjudaEspectadors() {
		System.out.println("*Donant indicacions als assistents*");
	}
	
}
