/*****************************************************************************
 * Classe qui contient les utilitaires reliés au train de modèle 
 * TvgAtlantique et hérite de la classe AbstractTrain qui hérite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class TvgAtlantique extends AbstractTrain{

	// Déclaration des attributs
	private int nbPassagersMax = TVG_ATLANTIQUE_NB_PASSAGERS_MAX;
	
	// Constructeur par défaut
	public TvgAtlantique() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette méthode accède à l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
	
	/*************************************************************************
	 * Cette méthode renvoie une chaîne de caractère contenant le modèle du 
	 * véhicule.
	 */
	public String toString(){
		
		return "TvgAtlantique";
	}
}
