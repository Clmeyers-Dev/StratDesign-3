/**
 * 
 */

/**
 * @author chris
 *
 */
public class Skill extends PlayerDecorator {

	Player player;
	public Skill(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  player.toString() + "\nGained a skill";
	}

	@Override
	public double getPower() {
		// TODO Auto-generated method stub
		return player.getPower()+2;
	}

}
