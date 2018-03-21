/*****************************************************************************
 * Classe abstraite qui contient les utilitaires reliés à l'autobus et 
 * hérite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public abstract class AbstractAutobus extends AbstractVehicule{

	// Constructeur par défaut
	public AbstractAutobus() {
		
		super(AbstractVehicule.ESSENCE);
	}
}
