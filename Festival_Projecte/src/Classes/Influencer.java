package Classes;
import Enumeration.HumanNeeds;
import Enumeration.TipusInfluencer;

public class Influencer extends VIP implements Comparable<Influencer> {
	private TipusInfluencer tipusInfluencer;
	private int numSeguidors;
	private String nick;
	
	/**
	 * Constructor
	 */
	public Influencer(String nom, String cognoms, String DNI, int edat, TipusInfluencer influencer, int seguidors, String nick) {
		super(nom, cognoms, DNI, edat);
		this.tipusInfluencer = influencer;
		this.numSeguidors = seguidors;
		this.nick = nick;
		
	}
	
	public TipusInfluencer getTipusInfluencer() {
		return tipusInfluencer;
	}

	public int getNumSeguidors() {
		return numSeguidors;
	}

	public String getNick() {
		return nick;
	}
	
	/**
	 * Per simular que els influencers fan post a les seves xarxes socials
	 */
	public void PostEnXarxesSocials() {
		System.out.println("L'influencer " + nick + " (" + super.nom + " " + super.cognoms + ") "
				+ "acaba de publicar un nou post a les seves xarxes socials sobre el festival.");
	}
	
	/**
	 * Per simular que els influencers es fan fotos al photocall
	 */
	public void PhotoCall() {
		System.out.println("L'influencer " + nick + " (" + super.nom + " " + super.cognoms + ") s'està fent fotos al photocall del festival "
				+ "amb seguidors, altres influencers i marques.");
	}
	
	/**
	 * Comparar un influencer amb un altre i determinar qui té més seguidors
	 * @param Un influencer
	 */
	@Override
	public int compareTo(Influencer i) {
		if (this.numSeguidors == i.numSeguidors)		return 0;
		else if (this.numSeguidors > i.numSeguidors)	return 1;
		else 											return -1;
	}

	/**
	 * Mètode ComplirNecessitats() personal·litzat pels influencers
	 */
	@Override
	public void ComplirNecessitats() {
		if(this.necessitats != HumanNeeds.Cap) {
			this.setNecessitats(HumanNeeds.Cap);
		} else {
			System.out.println("L'infuencer " + nom + " " + cognoms +" no té cap necessitat.");
		}		
	}
}
