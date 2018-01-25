package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class GreatKnight extends Unit {

	public GreatKnight() {
		this.setJob("Great Knight");
		this.addWeapon(new IronAxe());
		this.addWeapon(new IronSword());
		this.addWeapon(new IronLance());
		this.setHpBase(23);
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(1);

		this.setHpGr(85);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(50);
		this.setResGr(25);

		this.setStrCap(28);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(23);
	}

}
