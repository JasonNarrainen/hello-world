/*****************************************************************************
 * Classe qui contient les utilitaires reliés au train de modèle 
 * TvgDuplex et hérite de la classe AbstractTrain qui hérite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class TvgDuplex extends AbstractTrain{

	// Déclaration des attributs
	private int nbPassagersMax = TVG_DUPLEX_NB_PASSAGERS_MAX;
	
	// Constructeur par défaut
	public TvgDuplex() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette méthode accède à l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
