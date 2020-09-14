
/**
 * @author chris
 *
 */
public class Mage extends Player {

	/**
 * @param name
 */
public Mage(String name) {
	
	this.name = name;
	intellect = 7;
	attack = 3;
	defense = 4;
	weapon = "staf";
	armor = "Robe";
}


	/**
	 *
	 */
	@Override
public String toString() {
	return "Mage: " + name +  super.toString();
	
}
}
