
/**
 * @author chris
 *
 */
public class ArmorUpgrade extends PlayerDecorator {

	
	private Player player;

	public ArmorUpgrade(Player player) {
		
		this.player = player;
		
		
	}

	public String toString() {
		
		return  player.toString() + "\nUpgraded armor";
		
		
	}

	public double getPower() {
		
		return player.getPower()+3;
	}

}
