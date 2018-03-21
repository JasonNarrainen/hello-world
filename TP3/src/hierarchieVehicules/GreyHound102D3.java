/*****************************************************************************
 * Classe qui contient les utilitaires reli�s � l'autobus de mod�le 
 * GreyHound102D3 et h�rite de la classe AbstractAutobus qui h�rite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class GreyHound102D3 extends AbstractAutobus{

	// D�claration des attributs
	private int nbPassagersMax = GREYHOUND102D3_NB_PASSAGERS_MAX;
	
	// Constructeur par d�faut
	public GreyHound102D3() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette m�thode acc�de � l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
