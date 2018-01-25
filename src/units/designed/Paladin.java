package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Paladin extends Unit {

	public Paladin() {
		this.setJob("Paladin");
		this.addWeapon(new IronSword());
		this.addWeapon(new IronLance());
		this.addWeapon(new IronAxe());
		this.setHpBase(22);
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(3);

		this.setHpGr(85);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(27);
		this.setResCap(25);
	}

}
