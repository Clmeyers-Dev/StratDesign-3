
/**
 * @author chris
 *
 */
public class Warrior extends Player {
String name = "";

public Warrior(String name) {
	
	this.name = name;
	intellect = 2;
	attack = 8;
	defense = 5;
	weapon = "Sword";
	armor = "Breast Plate";
	// TODO Auto-generated constructor stub
}


	@Override
public String toString() {
	return "Warrior: " + name+  super.toString();
	
}
}
