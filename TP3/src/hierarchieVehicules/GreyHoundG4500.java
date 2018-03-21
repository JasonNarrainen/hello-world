/*****************************************************************************
 * Classe qui contient les utilitaires reliés à l'autobus de modèle 
 * GreyHoundG4500 et hérite de la classe AbstractAutobus qui hérite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class GreyHoundG4500 extends AbstractAutobus{

	// Déclaration des attributs
	private int nbPassagersMax = GREYHOUNDG4500_NB_PASSAGERS_MAX;
	
	// Constructeur par défaut
	public GreyHoundG4500() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette méthode accède à l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
