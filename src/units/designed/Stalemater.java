package units.designed;

import units.factory.Unit;
import weapons.IronSword;

public class Stalemater extends Unit {

	public Stalemater() {
		this.setJob("Stalemater");
		this.addWeapon(new IronSword());
		this.setHpBase(20);
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(9);
		this.setLuckBase(8);
		this.setDefBase(8);
		this.setResBase(8);

		this.setHpGr(65);
		this.setStrGr(0);
		this.setSkillGr(0);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(85);
		this.setResGr(85);

		this.setStrCap(0);
		this.setSkillCap(0);
		this.setSpeedCap(30);
		this.setDefCap(30);
		this.setResCap(30);
	}

}
