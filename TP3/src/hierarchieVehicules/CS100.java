/*****************************************************************************
 * Classe qui contient les utilitaires reli�s � l'avion de mod�le CS100 et 
 * h�rite de la classe AbstractAvion qui h�rite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public class CS100 extends AbstractAvion{

	// D�claration des attributs
	private int nbPassagersMax;
	
	// Constructeur par d�faut
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
