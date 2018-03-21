/*****************************************************************************
 * Classe qui contient les utilitaires reli�s au train de mod�le 
 * TvgDuplex et h�rite de la classe AbstractTrain qui h�rite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class TvgDuplex extends AbstractTrain{

	// D�claration des attributs
	private int nbPassagersMax = TVG_DUPLEX_NB_PASSAGERS_MAX;
	
	// Constructeur par d�faut
	public TvgDuplex() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette m�thode acc�de � l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
