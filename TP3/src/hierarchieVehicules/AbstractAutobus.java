/*****************************************************************************
 * Classe abstraite qui contient les utilitaires reli�s � l'autobus et 
 * h�rite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public abstract class AbstractAutobus extends AbstractVehicule{

	// Constructeur par d�faut
	public AbstractAutobus() {
		
		super(AbstractVehicule.ESSENCE);
	}
}
