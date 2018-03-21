/*****************************************************************************
 * Classe qui contient les utilitaires reliés à l'autobus de modèle 
 * GreyHound102D3 et hérite de la classe AbstractAutobus qui hérite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class GreyHound102D3 extends AbstractAutobus{

	// Déclaration des attributs
	private int nbPassagersMax = GREYHOUND102D3_NB_PASSAGERS_MAX;
	
	// Constructeur par défaut
	public GreyHound102D3() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette méthode accède à l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
