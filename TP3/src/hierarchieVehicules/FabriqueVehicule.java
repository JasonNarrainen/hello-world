/*****************************************************************************
 * Classe qui construit un v�hicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class FabriqueVehicule {

	// Constantes
	public static final int NB_TYPES_VEHICULES = 6;
	public static final int CS100 = 0;
	public static final int CS300 = 1;
	public static final int GREYHOUND_102D3 = 2;
	public static final int GREYHOUND_G4500 = 3;
	public static final int TGV_ATLANTIQUE = 4;
	public static final int TGV_DUPLEX = 5;
	
	// D�claration des attributs
	private int nbTypesVehicules = NB_TYPES_VEHICULES;

	/*************************************************************************
	 * Cette m�thode retourne le nombre de types de v�hicules.
	 * 
	 * @return NB_TYPES_VEHICULES;
	 */
	public static int getNbTypesVehicule() {
		
		return NB_TYPES_VEHICULES;
	}

	/*************************************************************************
	 * Cette m�thode instancie un vehicule d�pendamment du nombre entier re�u
	 * en param�tre. 
	 * @param i
	 * @return InterfaceVehicules
	 */
	public static InterfaceVehicules obtenirVehicule(int i) {
		/***************************************************
		 * Strat�gie:
		 * 
		 * Utilisation d'un switch-case pour que la cr�ation
		 * de l'objet d�pende du nombre entier re�u en param�tre.
		 */
		
		// On d�clare la variable.
		InterfaceVehicules vehicule;
		
		// Les cas d�pendent de i.
		switch (i) {

		case CS100:

			vehicule = new CS100();
			break;

		case CS300:
			vehicule = new CS300();
			break;
		
		case GREYHOUND_102D3:
			vehicule = new GreyHound102D3();
			break;
		
		case GREYHOUND_G4500:
			vehicule = new GreyHoundG4500();
			break;
		
		case TGV_ATLANTIQUE:
			vehicule = new TvgAtlantique();
			break;
		
		case TGV_DUPLEX:
			vehicule = new TvgDuplex();
			break;
		
		default:
			vehicule = null;
			break;
		}
		
		return vehicule;
	}
}
