
import Classes.Artista;
import Classes.Comanda;
import Classes.Equip_tècnic_So_i_iluminació;
import Classes.Espectador;
import Classes.Foodtruck;
import Classes.Influencer;
import Classes.Persona;
import Classes.Personal_Seguretat;
import Classes.Press;
import Classes.Sponsor;
import Classes.Staff;
import Enumeration.HumanNeeds;
import Enumeration.MenuTipus;
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
		Persona p6 = new Artista("Aitana", "Ocaña", "47569872W", 19, TipusTorn.Tarda, 17, 18, 1000, "Aitana");
		Persona p7 = new Personal_Seguretat("Arnau", "Subirós", "43689742E", 40, TipusTorn.Nit, 19, 23, 500);
		Persona p8 = new Equip_tècnic_So_i_iluminació("Eloi", "Breu", "48326484W", 20, TipusTorn.Matí, 9, 13, 300, "Jordi Binefa", false );
		Persona p9 = new Staff("Marc", "Guimenez", "45368745E", 23, TipusTorn.Tarda, 13, 19, 600);
		Persona p10 = new Foodtruck("Pau", "Desumvila", "46987236A", 28, TipusTorn.Tarda, 13, 19, 750, "Alejandro Martinez", false, 10000);
		Comanda c1 = new Comanda(50, MenuTipus.Ensalada);
		Persona p11 = new Artista("Héctor", "López", "47569872R", 29, TipusTorn.Nit, 19, 20, 5000, "Paüra" );
		
		
		p1.AccedeixenAlRecinte();
		c1.ComandaAcabada();
		p11.ComplirNecessitats();
		p2.setNecessitats(HumanNeeds.Gana);
		p2.ComplirNecessitats();
		p1.setNecessitats(HumanNeeds.Lavabo);
		p2.Cantar();
		
		
	}
	
	
}
