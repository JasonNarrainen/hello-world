/*****************************************************************************
 * Classe qui contient les utilitaires reli�s � l'autobus de mod�le 
 * GreyHoundG4500 et h�rite de la classe AbstractAutobus qui h�rite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class GreyHoundG4500 extends AbstractAutobus{

	// D�claration des attributs
	private int nbPassagersMax = GREYHOUNDG4500_NB_PASSAGERS_MAX;
	
	// Constructeur par d�faut
	public GreyHoundG4500() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette m�thode acc�de � l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
