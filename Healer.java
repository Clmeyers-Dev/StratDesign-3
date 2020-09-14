
/**
 * @author chris
 *
 */
public class Healer extends Player {

	/**
 * @param name
 */
public Healer(String name) {
	
	// TODO Auto-generated constructor stub
	this.name = name;
	intellect = 8;
	attack = 2;
	defense = 3;
	weapon = "staf";
	armor = "robe";
}


	@Override
public String toString() {
	return "Healer: " + name+ super.toString();
	
}
}
