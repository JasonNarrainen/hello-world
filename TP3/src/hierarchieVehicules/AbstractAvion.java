/*****************************************************************************
 * Classe abstraite qui contient les utilitaires reli�s � l'avion et 
 * h�rite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public abstract class AbstractAvion extends AbstractVehicule{

	// Constructeur par d�faut
	public AbstractAvion() {
		
		super(AbstractVehicule.KEROSENE);
	}
}
