/*****************************************************************************
 * Classe qui contient les utilitaires reli�s � l'avion de mod�le CS300 et 
 * h�rite de la classe AbstractAvion qui h�rite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class CS300 extends AbstractAvion{

	// D�claration des attributs
	private int nbPassagersMax = CS300_NB_PASSAGERS_MAX;
	
	// Constructeur par d�faut
	public CS300() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette m�thode acc�de � l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}