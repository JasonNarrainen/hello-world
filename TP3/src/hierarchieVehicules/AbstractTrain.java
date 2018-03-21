/*****************************************************************************
 * Classe abstraite qui contient les utilitaires reli�s au train et 
 * h�rite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public abstract class AbstractTrain extends AbstractVehicule{

	// Constructeur par d�faut
	public AbstractTrain() {
		
		super(AbstractVehicule.ELECTRICITE);
	}
}
