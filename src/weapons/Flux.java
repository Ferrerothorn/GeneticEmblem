package weapons;

import weapons.Weapon;

public class Flux extends Weapon {

	public Flux() {
		super.setTrinity("Dark");
		super.setPow(7);
		super.addTrait("Ranged");
		super.setAcc(80);
		super.setPhys(false);
		super.setName("Flux");
	}
}
