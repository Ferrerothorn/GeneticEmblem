package weapons;

import weapons.Weapon;

public class IronBow extends Weapon {

	public IronBow() {
		super.setTrinity("Bow");
		super.addTrait("Ranged");
		super.addTrait("Arrow");
		super.setPow(6);
		super.setAcc(85);
		super.setPhys(true);
		super.setName("IronBow");
	}
}
