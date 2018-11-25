package Classes;
import Enumeration.TipusVIP; 

public abstract class VIP extends Persona {
	protected TipusVIP tipusVIP;
	protected int diesAssistencia;
	
	public VIP(String nom, String cognoms, String DNI, int edat, TipusVIP tipusVIP) {
		super(nom, cognoms, DNI, edat);
		this.tipusVIP = tipusVIP;
		this.diesAssistencia = 2;
	}

	public TipusVIP getTipusVIP() {
		return tipusVIP;
	}	
	
}
