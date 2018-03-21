/*****************************************************************************
 * Classe qui contient les utilitaires reliés à l'avion de modèle CS100 et 
 * hérite de la classe AbstractAvion qui hérite de la classe AbstractVehicule.
 * 
 * @author Jason Narrainen
 * @version 21/03/2018
 */
package hierarchieVehicules;

public class CS100 extends AbstractAvion{

	// Déclaration des attributs
	private int nbPassagersMax = CS100_NB_PASSAGERS_MAX;;
	
	// Constructeur par défaut
	public CS100() {
		
		super();
	}

	/*************************************************************************
	 * Cette méthode accède à l'attribut nbPassagerMax.
	 */
	public int getNbPassagersMax() {
		
		return nbPassagersMax;
	}

	/*************************************************************************
	 * Cette méthode renvoie une chaîne de caractère contenant le modèle du 
	 * véhicule.
	 */
	public String toString(){
		
		return "CS100";
	}
}
