/*****************************************************************************
 * Classe qui contient les utilitaires reli�s au train de mod�le 
 * TvgAtlantique et h�rite de la classe AbstractTrain qui h�rite de la 
 * classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class TvgAtlantique extends AbstractTrain{

	// D�claration des attributs
	private int nbPassagersMax = TVG_ATLANTIQUE_NB_PASSAGERS_MAX;
	
	// Constructeur par d�faut
	public TvgAtlantique() {
		
		super();
	}
	
	/*************************************************************************
	 * Cette m�thode acc�de � l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}
}
