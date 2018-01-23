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

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(22);
	}

}
