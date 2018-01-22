package units.designed;

import units.factory.Unit;
import weapons.SteelLance;

public class Recruit extends Unit {

	public Recruit() {
		this.setJob("Recruit");
		this.addWeapon(new SteelLance());
		this.setBaseCrit(15);
		this.setHpBase(21);
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(8);
		this.setDefBase(5);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(55);
		this.setDefGr(35);
		this.setResGr(20);

		this.setStrCap(23);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(22);
		this.setResCap(24);
	}

}
