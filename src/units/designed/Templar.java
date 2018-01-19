package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.Lightning;

public class Templar extends Unit {

	public Templar() {
		this.setJob("Templar");
		this.addWeapon(new IronLance());
		this.addWeapon(new Lightning());
		this.setHpBase(22);
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(3);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(30);
		this.setDefGr(50);
		this.setResGr(35);

		this.setStrCap(26);
		this.setSkillCap(23);
		this.setSpeedCap(24);
		this.setDefCap(27);
		this.setResCap(25);
	}

}
