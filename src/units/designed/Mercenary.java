package units.designed;

import units.factory.Unit;
import weapons.SteelSword;

public class Mercenary extends Unit {

	public Mercenary() {
		this.setJob("Mercenary");
		this.addWeapon(new SteelSword());
		this.setHpBase(21);
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(3);

		this.setHpGr(75);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(35);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(26);
		this.setSkillCap(27);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(22);
	}

}
