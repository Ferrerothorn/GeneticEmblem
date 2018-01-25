package units.designed;

import units.factory.Unit;
import weapons.SteelLance;

public class Halberdier extends Unit {

	public Halberdier() {
		this.setJob("Halberdier");
		this.addWeapon(new SteelLance());
		this.setHpBase(21);
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(3);

		this.setHpGr(70);
		this.setStrGr(55);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(25);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(27);
		this.setResCap(22);
	}

}
