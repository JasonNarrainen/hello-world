package hierarchieVehicules;

/**
 * Décrit les méthodes utiles à la simulation dans la 
 * une hiérarchie des véhicules dans le cadre du tp3 inf111 H18.
 * 
 * @author Pierre Bélisle
 * @version copyright H2018
 */
public interface InterfaceVehicules {
	
	// Les types de carburant.  Servent comme indice de tableau
	// pour retrouver des facteurs d'ajustement futurs.
	public static final int ESSENCE = 0;
	public static final int KEROSENE = 1;	
	public static final int ELECTRICITE = 2;
	
	// Les noms de type de carburant.
	public final String [] tabNomTypeCarburant =
									{"Essence", "Kerosene", "electricite"};
	/**
	 *  Accesseur du type de carburant qu'un véhicule doit fournir
	 *  
	 * @return Le type de carburant d'un véhicule.
	 */
	public int getTypeCarburant();
	
	/**
	 * Retourne le nombre de passagers maximum du véhicule.
	 * 
	 * @return Le nombre de passagers maximum.
	 */
	public int getNbPassagersMax();
	
}
