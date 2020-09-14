/**
 * 
 */

/**
 * @author chris
 *
 */
public class WeaponUpgrade extends PlayerDecorator {

	Player player;
	public WeaponUpgrade(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  player.toString() +  "\nUpgraded weapon";
	}

	@Override
	public double getPower() {
		// TODO Auto-generated method stub
		return player.getPower()+5;
	}

}
