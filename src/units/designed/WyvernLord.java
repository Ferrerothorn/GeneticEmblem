package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class WyvernLord extends Unit {

	public WyvernLord() {
		this.setJob("Wyvern Lord");
		this.addTrait("Flying");
		this.addWeapon(new IronLance());
		this.addWeapon(new IronSword());
		this.setHpBase(23);
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(5);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(2);

		this.setHpGr(75);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(20);
		this.setDefGr(45);
		this.setResGr(15);

		this.setStrCap(29);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(29);
		this.setResCap(22);
	}

}
