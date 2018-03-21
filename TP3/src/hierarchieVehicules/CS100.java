/*****************************************************************************
 * Classe qui contient les utilitaires reliés à l'avion de modèle CS100 et 
 * hérite de la classe AbstractAvion qui hérite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public class CS100 extends AbstractAvion{

	// Déclaration des attributs
	private int nbPassagersMax;
	
	// Constructeur par défaut
	public CS100() {
		super();
		nbPassagersMax = CS100_NB_PASSAGERS_MAX;
	}
	
	public int getTypeCarburant() {
		
		return getCarburant();
	}

	
	public int getNbPassagersMax() {
		
		return 0;
	}

	
}
