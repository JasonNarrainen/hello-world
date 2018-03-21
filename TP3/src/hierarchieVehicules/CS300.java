/*****************************************************************************
 * Classe qui contient les utilitaires reliés à l'avion de modèle CS300 et 
 * hérite de la classe AbstractAvion qui hérite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class CS300 extends AbstractAvion{

	// Déclaration des attributs
	private int nbPassagersMax = CS300_NB_PASSAGERS_MAX;
	
	// Constructeur par défaut
	public CS300() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette méthode accède à l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}