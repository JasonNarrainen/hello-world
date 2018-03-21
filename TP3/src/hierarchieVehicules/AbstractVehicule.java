/*****************************************************************************
 * Classe abstraite qui contient les utilitaires reliés au véhicule et 
 * implémente l'interface InterfaceVehicules.
 * 
 * @author Jason Narrainen
 * @version 20/03/2018
 */
package hierarchieVehicules;

public abstract class AbstractVehicule implements InterfaceVehicules{

	// Constantes
	public static final int CS100_NB_PASSAGERS_MAX = 110;
	public static final int CS300_NB_PASSAGERS_MAX = 130;
	public static final int GREYHOUND102D3_NB_PASSAGERS_MAX = 46;
	public static final int GREYHOUNDG4500_NB_PASSAGERS_MAX = 55;
	public static final int TVG_ATLANTIQUE_NB_PASSAGERS_MAX = 485;
	public static final int TVG_DUPLEX_NB_PASSAGERS_MAX = 455;
	
	// Déclaration de l'attribut
	private int carburant;
	
	// Constructeur par copie d'attributs
	public AbstractVehicule(int carburant) {
		
		this.carburant = carburant;
	}
	
	// Cette méthode accède à l'attribut carburant et le retourne.
	public int getCarburant() {
		
		return carburant;
	}
	
	// Cette méthode modifie la valeur de l'attribut carburant.
	public void setCarburant(int carburant) {
		
		this.carburant = carburant;
	}
}
