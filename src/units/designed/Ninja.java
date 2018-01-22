package units.designed;

import units.factory.Unit;
import weapons.IronBow;
import weapons.IronSword;

public class Ninja extends Unit {

	public Ninja() {
		this.setJob("Ninja");
		this.addWeapon(new IronSword());
		this.addWeapon(new IronBow());
		this.setHpBase(20);
		this.setStrBase(5);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(7);
		this.setDefBase(2);
		this.setResBase(1);

		this.setHpGr(55);
		this.setStrGr(33);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(55);
		this.setDefGr(21);
		this.setResGr(21);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(22);
	}

}
