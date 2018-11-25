package Classes;
import Enumeration.TipusInfluencer;
import Enumeration.TipusVIP;

public class Influencer extends VIP {
	private TipusInfluencer tipusInfluencer;
	private int numSeguidors;
	private String nick;
	
	public Influencer(String nom, String cognoms, String DNI, int edat, TipusVIP tipusVIP, TipusInfluencer influencer, int seguidors, String nick) {
		super(nom, cognoms, DNI, edat, tipusVIP);
		this.tipusInfluencer = influencer;
		this.numSeguidors = seguidors;
		this.nick = nick;
		
	}
	
	public void PostEnXarxesSocials() {
		System.out.println("L'influencer " + nick + " (" + super.nom + " " + super.cognoms + ") "
				+ "acaba de publicar un nou post a les seves xarxes socials sobre el festival.");
	}
	
	public void PhotoCall() {
		System.out.println("L'influencer " + nick + " (" + super.nom + " " + super.cognoms + ") s'està fent fotos al photocall del festival "
				+ "amb seguidors, altres influencers i marques.");
	}
}
