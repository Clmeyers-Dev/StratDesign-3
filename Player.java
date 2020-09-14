

/**
 * @author chris
 *
 */
public abstract class Player {
protected String name = "";
protected int intellect = 0;
protected int defense =0;
protected int attack=0;
protected String weapon ="";
protected String armor ="";

public String toString() {
	return "\ncarries a " + weapon + " ,and wears a "+ armor;
}
public double getPower() {
	return  attack*3+defense+intellect/2;
	
}
}
