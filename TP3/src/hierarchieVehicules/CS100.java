/*****************************************************************************
 * Classe qui contient les utilitaires reli�s � l'avion de mod�le CS100 et 
 * h�rite de la classe AbstractAvion qui h�rite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class CS100 extends AbstractAvion{

	// D�claration des attributs
	private int nbPassagersMax = CS100_NB_PASSAGERS_MAX;;
	
	// Constructeur par d�faut
	public CS100() {
		
		super();
	}

	/*************************************************************************
	 * Cette m�thode acc�de � l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}

	/*************************************************************************
	 * Cette m�thode renvoie une cha�ne de caract�re contenant le mod�le du 
	 * v�hicule.
	 */
	public String toString(){
		
		return "CS100";
	}
}
