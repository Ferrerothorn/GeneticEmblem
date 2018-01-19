package weapons;

import weapons.Weapon;

public class SteelSword extends Weapon {

	public SteelSword() {
		super.setTrinity("Sword");
		super.setPow(8);
		super.setAcc(75);
		super.setPhys(true);
		super.setName("SteelSword");
	}
}