package weapons;

import weapons.Weapon;

public class Geomancy extends Weapon {

	public Geomancy() {
		super.setTrinity("");
		super.setPow(6);
		super.addTrait("Ranged");
		super.setAcc(85);
		super.setCrit(5);
		super.setPhys(false);
		super.setName("Geomancy");
	}
}
