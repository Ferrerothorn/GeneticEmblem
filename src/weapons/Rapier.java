package weapons;

import weapons.Weapon;

public class Rapier extends Weapon {

	public Rapier() {
		super.setTrinity("Sword");
		super.addTrait("Armorslayer");
		super.addTrait("Horseslayer");
		super.setPow(7);
		super.setAcc(95);
		super.setCrit(10);
		super.setPhys(true);
		super.setName("Rapier");
	}
}
