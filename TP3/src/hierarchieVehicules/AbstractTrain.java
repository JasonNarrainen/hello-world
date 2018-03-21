/*****************************************************************************
 * Classe abstraite qui contient les utilitaires reliés au train et 
 * hérite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public abstract class AbstractTrain extends AbstractVehicule{

	// Constructeur par défaut
	public AbstractTrain() {
		
		super(AbstractVehicule.ELECTRICITE);
	}
}
