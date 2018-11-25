import java.util.Date;

import Classes.Artista;
import Classes.Espectador;
import Classes.Influencer;
import Classes.Persona;
import Classes.Press;
import Classes.Sponsor;
import Enumeration.TipusEntrada;
import Enumeration.TipusInfluencer;
import Enumeration.TipusMitjaCom;
import Enumeration.TipusTorn;

/**
 * 
 * @author damura
 * @author fecaqu
 * @version 1.0
 * @since 25-11-18
 */

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Espectador("Dani", "Muelle Ramos", "47366823A", 19, TipusEntrada.Premium, 2, 1000);
		Persona p2 = new Influencer("Ruben", "Garcia", "45365715B", 25, TipusInfluencer.Instagramer, 94000, "rvbengarcia");
		Persona p3 = new Influencer("Aida", "Domenech", "46325874F", 26, TipusInfluencer.Youtuber, 3000000, "Dulceida");
		Persona p4 = new Sponsor ("Gerard", "Piqué", "47236587Q", 31, "Kerad Games");
		Persona p5 = new Press("Josep", "Pedrerol", "42365874J", 55, TipusMitjaCom.Televisió, "Mega" );
		//Persona p6 = new Artista("Aitana", "Ocaña", "47569872W", 19, TipusTorn.Tarda, (25,11,2018,15,00,00), (25, 11, 2018, 18, 00, 00), 1000, "Aitana");
	}
	
	
}
